package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.BO.CustName;

public class CustomerOracleDaoImpl implements ICustomerDao {
	
	private static final String OraQuery="insert into Customer1(CustAd,pamt,rate,time,intrestAmount) values(?,?,?,?,?)";
	private DataSource ds;
	

	public CustomerOracleDaoImpl(DataSource ds) {
		System.out.println("Oracle DAO construction param");
		this.ds = ds;
	}


	@Override
	public int insert(CustName Bo) throws Exception {
		int count;
		try (Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(OraQuery)){
			ps.setString(1, Bo.getCustAd());
			ps.setFloat(2, Bo.getPamt());
			ps.setFloat(3, Bo.getRate());
			ps.setFloat(4, Bo.getTime());
			ps.setFloat(5,Bo.getItrestAmount());
			count=ps.executeUpdate();
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}

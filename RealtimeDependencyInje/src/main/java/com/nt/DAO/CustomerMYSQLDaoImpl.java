package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.BO.CustName;

public class CustomerMYSQLDaoImpl implements ICustomerDao {
	
	private static final String Customer_SQL="INSERT INTO REALTIMEDI_CUSTOMER(custAd,pamt,rate,time,itrestAmount) VALUES(?,?,?,?,?)";
	private DataSource ds;
	

	public CustomerMYSQLDaoImpl(DataSource ds) {
		super();
		System.out.println("set the datasource");
		this.ds = ds;
	}

	@Override
	public int insert(CustName Bo) throws Exception {
		int count=0;
		try(Connection con=ds.getConnection();
				PreparedStatement po=con.prepareStatement(Customer_SQL)){
			po.setString(1,Bo.getCustAd());
			po.setFloat(2,Bo.getPamt());
			po.setFloat(3, Bo.getRate());
			po.setFloat(4,Bo.getTime());
			po.setFloat(5, Bo.getItrestAmount());
			
			count=po.executeUpdate();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		
		return count;
	}

	

}

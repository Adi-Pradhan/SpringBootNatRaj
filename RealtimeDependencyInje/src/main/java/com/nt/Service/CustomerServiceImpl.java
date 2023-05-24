package com.nt.Service;

import com.nt.DAO.CustomerMYSQLDaoImpl;
import com.nt.DAO.CustomerOracleDaoImpl;
import com.nt.DAO.ICustomerDao;
import com.nt.DTO.CustName;

public class CustomerServiceImpl implements ICustomerService {
	private CustomerMYSQLDaoImpl dao;
	private CustomerOracleDaoImpl ora;
	

	public CustomerServiceImpl(CustomerMYSQLDaoImpl dao,CustomerOracleDaoImpl ora) {
		System.out.println("Customerservice cons run");
		this.dao = dao;
		this.ora=ora;
	}


	@Override
	public String calculationSimpleInterest(CustName dto) throws Exception {
		float intrAmt=(dto.getPmat()*dto.getRate()*dto.getTime())/100.0f;
		com.nt.BO.CustName bo=new com.nt.BO.CustName();
		bo.setCustAd(dto.getCustAd());
		bo.setPamt(dto.getPmat());
		bo.setTime(dto.getTime());
		bo.setRate(dto.getRate());
		bo.setItrestAmount(intrAmt);
		
		int count=dao.insert(bo);
		int turn=ora.insert(bo);
		return turn==1*count?"Successfully inserted in database"+intrAmt:"there is some problemt to insert";
	}

}

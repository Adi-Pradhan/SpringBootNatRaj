package com.nt.Controller;

import com.nt.Service.CustomerServiceImpl;
import com.nt.vo.CustName;

public class MainController {
private CustomerServiceImpl svc;

public MainController(CustomerServiceImpl svc) {
	super();
	System.out.println("Controller initiate");
	this.svc = svc;
}

public String processCustomer(CustName vo)throws Exception{
	com.nt.DTO.CustName dt=new com.nt.DTO.CustName();
	dt.setCustAd(vo.getCustAd());
	dt.setPmat(Float.parseFloat(vo.getPamt()));
	dt.setRate(Float.parseFloat(vo.getRate()));
	dt.setTime(Float.parseFloat(vo.getTime()));
	String st=svc.calculationSimpleInterest(dt);
	return st;
	
}
}

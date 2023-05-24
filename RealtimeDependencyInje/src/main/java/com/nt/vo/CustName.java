package com.nt.vo;

public class CustName {

	private String custAd;
	private String pamt;
	private String rate;
	private String time;
	public String getCustAd() {
		return custAd;
	}
	public void setCustAd(String custAd) {
		this.custAd = custAd;
	}
	public String getPamt() {
		return pamt;
	}
	public void setPamt(String pamt) {
		this.pamt = pamt;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "CustName [custAd=" + custAd + ", pamt=" + pamt + ", rate=" + rate + ", time=" + time + "]";
	}
	
	
	

}

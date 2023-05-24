package com.nt.DTO;

public class CustName {
 private String custAd;
 private Float pmat;
 private Float rate;
 private Float time;
public String getCustAd() {
	return custAd;
}
public void setCustAd(String custAd) {
	this.custAd = custAd;
}
public Float getPmat() {
	return pmat;
}
public void setPmat(Float pmat) {
	this.pmat = pmat;
}
public Float getRate() {
	return rate;
}
public void setRate(Float rate) {
	this.rate = rate;
}
public Float getTime() {
	return time;
}
public void setTime(Float time) {
	this.time = time;
}
@Override
public String toString() {
	return "CustName [custAd=" + custAd + ", pmat=" + pmat + ", rate=" + rate + ", time=" + time + "]";
}
 
}

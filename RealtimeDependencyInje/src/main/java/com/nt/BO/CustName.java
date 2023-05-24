package com.nt.BO;

public class CustName {
	private String custAd;
	private Float pamt;
	private Float rate;
	private Float time;
	private Float itrestAmount;
	public String getCustAd() {
		return custAd;
	}
	public void setCustAd(String custAd) {
		this.custAd = custAd;
	}
	public Float getPamt() {
		return pamt;
	}
	public void setPamt(Float pamt) {
		this.pamt = pamt;
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
	public Float getItrestAmount() {
		return itrestAmount;
	}
	public void setItrestAmount(Float itrestAmount) {
		this.itrestAmount = itrestAmount;
	}
	@Override
	public String toString() {
		return "CustName [custAd=" + custAd + ", pamt=" + pamt + ", rate=" + rate + ", time=" + time + ", itrestAmount="
				+ itrestAmount + "]";
	}
	
}

package com.cg.mobile.DTO;

import java.util.Locale;

public class PurchaseDetails {
	
	private int purchaseId;
	public PurchaseDetails( String cName, String mailId,
			long phoneNo,int mobileId) {
		super();
		//this.purchaseId = purchaseId;
		this.cName = cName;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
		//this.purchaseDate = purchaseDate;
		this.mobileId = mobileId;
	}
	public PurchaseDetails()
	{
		
	}
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Locale getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Locale purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	@Override
	public String toString() {
		return "PurchaseDetails [purchaseId=" + purchaseId + ", cName=" + cName
				+ ", mailId=" + mailId + ", phoneNo=" + phoneNo
				+ ", purchaseDate=" + purchaseDate + ", mobileId=" + mobileId
				+ "]";
	}
	private String cName;
	private String mailId;
	private long phoneNo;
	private Locale purchaseDate;
	private int mobileId;
	

}


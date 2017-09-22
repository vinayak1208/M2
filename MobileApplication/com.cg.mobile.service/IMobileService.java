package com.cg.mobile.service;

import java.util.ArrayList;

import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplicationException;

public interface IMobileService {
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException;
	public boolean validateName(String cname);
	public boolean validateMailId(String mailId);
	public boolean validatePhoneNo(String num);
	public ArrayList<MobileDetails>retriveDetails();

}

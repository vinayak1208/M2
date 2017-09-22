package com.cg.mobile.service;

import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.dao.MobileDaoImpl;
import com.cg.mobile.exception.MobileApplicationException;

public class MobileServiceImpl implements IMobileService  {

	IMobileDAO dao=null;
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException {
		dao=new MobileDaoImpl();
		return dao.addPurchaseDetails(p);
	}
	
	
	public boolean validateName(String cname)
	{
		String ptn="[A-Z]{1}[a-zA-Z]{2,}";
		if(Pattern.matches(ptn,cname))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter the correct input");
			return false;
		}
		
	}
	
	public boolean validateMailId(String mailId)
	{
		String ptn="^[?=.*A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]{2,6}$";
		if(Pattern.matches(ptn,mailId))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter the correct input");
			return false;
		}
		
	}
	
	public boolean validatePhoneNo(String num)
	{
		String ptn="[789]{1}[0-9]{9}";
		if(Pattern.matches(ptn,num))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter the correct input");
			return false;
		}
		
	}
	
	public boolean validateMobileId(String mobileId)
	{
		String ptn="[0-9]{4}";
		if(Pattern.matches(ptn,mobileId))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter the correct input");
			return false;
		}
		
	}


	@Override
	public ArrayList<MobileDetails> retriveDetails() {
		// TODO Auto-generated method stub
		
		IMobileDAO dao=new MobileDaoImpl();
		return dao.retrieveDetails();
	}
	

}

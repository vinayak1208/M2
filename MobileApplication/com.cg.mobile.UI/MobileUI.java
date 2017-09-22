package com.cg.mobile.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.dao.MobileDaoImpl;
import com.cg.mobile.exception.MobileApplicationException;

public class MobileTest {
	
	static IMobileDAO dao=null;
	static PurchaseDetails bean=null;
	
	@BeforeClass
	
	public static void initialize()throws MobileApplicationException
	{
		dao=new MobileDaoImpl();
		bean=new PurchaseDetails();
		System.out.println("hi");
	}

	@Test
	public void test()
	{
		bean.setcName("vinayak");
		bean.setMailId("vinayak@gmail.com");
		bean.setMobileId(1001);
		bean.setPhoneNo(1234567890);
	}
	
	
	
	
	
	@Test
	public void testaddDetails() throws MobileApplicationException {
		
		assertNotNull(dao.addPurchaseDetails(bean));
		
	}
	@Test
	
	public void getDetails()
	{
		assertNotNull(dao.retrieveDetails());
	}

	@AfterClass
	public  static void test3()

{ 
		 System.out.println("hi after class");
	
}
	
}

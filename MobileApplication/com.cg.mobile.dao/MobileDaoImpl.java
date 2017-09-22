package com.cg.mobile.dao;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import com.cg.mobile.DButil.DBUtil;
import com.cg.mobile.DTO.MobileDetails;
import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplicationException;

public class MobileDaoImpl implements IMobileDAO {

	
	Connection con=null;
	@Override
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException {
		int n=0;
		// TODO Auto-generated method stub
		
		try {
DBUtil.getConnection();
			
			String insertQuery="Insert into purchasedetails1 values(purchase_seq_id.nextval,?,?,?,SYSDATE,?)";
			PreparedStatement ps=con.prepareStatement(insertQuery);
			ps.setString(1,p.getcName());
			ps.setString(2, p.getMailId());
			ps.setLong(3, p.getPhoneNo());
			String sql="select mobileid from mobiles where mobileid=?";
			PreparedStatement ps1=con.prepareStatement(sql);
			ps1.setInt(1,p.getMobileId());
			
			ResultSet rs= ps1.executeQuery();
			
			while(rs.next())
			{
				ps.setInt(4,rs.getInt(1));
			}
			
		 n=ps.executeUpdate();
			System.out.println(n+"Rows Inserted");
			
			
			
			
		} catch (IOException e ) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			throw new MobileApplicationException(e.getMessage());
			
		}
		return n;
	}

	@Override
	public ArrayList<MobileDetails> retrieveDetails()  {
		// TODO Auto-generated method stub
		ArrayList<MobileDetails> list=new ArrayList<MobileDetails>();
		try {
			con=DBUtil.getConnection();
			
			
			String sql="Select * from mobiles";
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				int mid=rs.getInt(1);
				String name=rs.getString(2);
				int price=rs.getInt(3);
				String quantity=(rs.getString(4));
				list.add(new MobileDetails(mid,price,name,quantity));
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

}

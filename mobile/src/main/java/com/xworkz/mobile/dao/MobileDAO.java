package com.xworkz.mobile.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.xworkz.mobile.dto.MobileDTO;

public class MobileDAO {
	
	
	public void saveMobileDetails1(MobileDTO dto) {
		Connection con =null;
		Statement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Bana1998");
			stmt = con.createStatement();
		stmt.execute("insert into mobile values('vivo','vivoxz',16789,2,64)");
		System.out.println("saved successfully");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
		try {
			if(stmt!=null)
			stmt.close();
			if(con!=null)
				con.close();
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		
	}
			
	}
	public void updateMobileStorageCapacityByBrandName(MobileDTO dto) {
		Connection con =null;
		Statement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Bana1998");
//			con.setAutoCommit(false);
			stmt = con.createStatement();
		stmt.executeUpdate("UPDATE mobile set  storage_capacity=32 where brand_name='vivo'");
//		stmt.executeUpdate("UPDATE mobile SET storagecapacity=4456545667 WHERE brandname='samsung'");
//		con.commit();
		System.out.println("saved successfully");
	}catch(SQLException e) {
		e.printStackTrace();
//			try {
//				if(con!=null)
//					con.rollback();
//			}catch(SQLException e2) {
//				e2.printStackTrace();
//				
//			}
		}finally {
		try {
			if(stmt!=null)
			stmt.close();
			if(con!=null)
				con.close();
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		
	}
			
	}
	public void DeleteMobileByPrice() {
		
		Connection con=null;
		Statement stmt= null;
		
		try {
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Bana1998");
			stmt = con.createStatement();

			stmt.execute("DELETE FROM mobile_details where price = '27000'");	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)
				stmt.close();
				if(con!=null);
				con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
}
	
	public void getBrandAndPriceByRom() {
		try(Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "lakshmi@1997");
			Statement statement = connection.createStatement();
				ResultSet resultset = statement.executeQuery("Select brand, price from mobile_details where Rom =32");)		{
			
			if(resultset.next()) {
				System.out.println(resultset.getString("brand"));
				System.out.println(resultset.getInt("price"));
				
			}
			else {
				System.out.println("No date found");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			
		}
	
	
	
	public void insertMobiles(List<MobileDTO> mobileList) {
		String insertQuery = "INSERT INTO mobile VALUES(?,?,?,?,?)";
		Connection connection=null;
		PreparedStatement statement=null; 
		try {
			Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Bana1998");
			PreparedStatement statement1 = connection1.prepareStatement(insertQuery);
			
			for(int i=0;i<mobileList.size();i++) {
				MobileDTO mobileDTO = mobileList.get(i);
				statement1.setString(1, mobileDTO.getBrandName());
				statement1.setString(2, mobileDTO.getModelName());
				statement1.setInt(3, mobileDTO.getPrice());
				statement1.setByte(4, mobileDTO.getRam());
				statement1.setInt(5, mobileDTO.getStoragecapacity());
				
				statement1.execute();
			}
			System.out.println("all mobiles saved successfully.......");
		}catch(SQLException e) {
		e.printStackTrace();
		}finally {
			try {
				if(statement!=null)
					statement.close();
				if(connection!=null)
					connection.close();
			}catch(SQLException e) {
				e.printStackTrace();			}				
				
			}
			
		}
	}



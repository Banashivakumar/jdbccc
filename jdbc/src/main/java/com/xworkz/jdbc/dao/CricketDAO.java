package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

import com.xworkz.jdbc.dto.CricketDetailsDTO;

public class CricketDAO {
	
	public boolean saveCricketDetails(CricketDetailsDTO dto) {
		//step1:
		//class.forname("com.mysql.cj.jdbc.driver");
		Connection con=null;
		Statement stmt=null;
        try {
			//step2:
		 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Bana1998");
		
		//step3:
		stmt= con.createStatement();
		//step4:
		stmt.execute("INSERT INTO cricket_details VALUES(1,'csk','msd',85)");
        }catch(SQLException e) {
        	e.printStackTrace();
		
        }
		return false;
	}
	

}

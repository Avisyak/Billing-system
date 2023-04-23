package com.Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
	  public static Connection connectDb() {
	    	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billingdb","root","");
				return con;
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	    	
			return null;
	    	
	    }
		

}

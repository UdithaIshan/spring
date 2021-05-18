package com.devstream.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost/hb_student_tracker?useSSL=false";
		String user = "root";
		String pwd = "";
		
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pwd);
			System.out.println("Success");
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}

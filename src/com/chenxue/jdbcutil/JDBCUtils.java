package com.chenxue.jdbcutil;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.sql.Connection;
import java.sql.Statement;


public class JDBCUtils {
	private static Connection con;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/test";
			String user="root";
			String password="root";
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getCon() {
		return con;
	}
	public static void close(Connection con,Statement stat,ResultSet rs) {
		if (rs!= null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (stat!=null) {
			try {
				stat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

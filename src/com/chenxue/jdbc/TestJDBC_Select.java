package com.chenxue.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBC_Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/test";
		String user="root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);
		String sql="select * from sort2";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString("sid")+"\t"+rs.getString("sname")+"\t"+rs.getString("sprice")+"\t");
			System.out.println();
		}
		rs.close();
		pst.close();
		con.close();
	}

}

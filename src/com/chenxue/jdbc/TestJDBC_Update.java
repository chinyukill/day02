package com.chenxue.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDBC_Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);
//		System.out.println(con);
		String sql = "UPDATE sort2 SET sname=?,sprice=?where sid=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setObject(1, "电视000");
		pst.setObject(2, "1222");
		pst.setObject(3, "1");
		int eut = pst.executeUpdate();
		System.out.println(eut);
		pst.close();
		con.close();
	}

}

package com.chenxue.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chenxue.JDBCDemo.JDBCUtilsConfig;

public class demo {

	public static void main(String[] args) throws SQLException {
		Connection con = JDBCUtilsConfig.getConnection();
		System.out.println(con);
		String sql ="select * from sort2";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			System.out.print(rs.getString("sname")+"\t"+rs.getString("sprice")+"\t"+rs.getString("sdesc"));
			System.out.println();
		}
		JDBCUtilsConfig.close(con, pst, rs);
	}

}

package com.chenxue.demo;

import java.sql.Connection;

import com.chenxue.JDBCDemo.JDBCUtilsConfig;

public class demo {

	public static void main(String[] args) {
		Connection con = JDBCUtilsConfig.getConnection();
		System.out.println(con);
	}

}

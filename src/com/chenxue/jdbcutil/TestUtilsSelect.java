package com.chenxue.jdbcutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class TestUtilsSelect {

	public static void main(String[] args) throws SQLException {
		Connection con = JDBCUtils.getCon();
		String sql="select sname from sort2";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("sname"));
		}
//		rs.close();
//		pst.close();
//		con.close();
		JDBCUtils.close(con, pst, rs);

	}

}

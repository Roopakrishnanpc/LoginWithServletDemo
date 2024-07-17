package com.servletproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
public boolean check(String uname,String pass)
{
	try
	{
		String url="jdbc:mysql://localhost:3306/SeveltExampleDB";
		String username="root";
		String password="roopa";
		String sql="select * from LOGIN where uname=? and pass=?";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url,username, password);
		//Statement s=conn.createStatement();
		PreparedStatement s=conn.prepareStatement(sql);
		//ResultSet rs=s.executeQuery(sql);
		s.setString(1,uname);
		s.setString(2,pass);
		ResultSet rs=s.executeQuery();
		if(rs.next())
			return true;
	}
	catch (SQLException e) {
        e.printStackTrace();
	}
	catch (Exception e) {
        e.printStackTrace();
	}
	return false;
}
}

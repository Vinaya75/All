package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Studentdb {
	public Studentdb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public void connectdb(Student s) {
	try {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		//Statement stmt= con.createStatement();
		PreparedStatement ps= con.prepareStatement("insert into student values("+s.getRollno()+",'"+ s.getName()+"','"+s.getGender()+"','"+s.getCourse()+"','"+s.getAddress()+"')");
		ps.execute();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	} 
}
}

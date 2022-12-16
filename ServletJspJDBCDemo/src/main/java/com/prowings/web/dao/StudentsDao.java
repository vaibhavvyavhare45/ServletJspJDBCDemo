package com.prowings.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.prowings.web.model.Students;

public class StudentsDao {

	public Students getStudents(int sid) {

		Students s = new Students();
		// dummy data object
//		s.setSid(101);
//		s.setSname("mukund");
//		s.setScourse("javascript");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from students where sid=" + sid);
			if (rs.next()) {
				s.setSid(rs.getInt("sid"));
				s.setSname(rs.getString("sname"));

				s.setScourse(rs.getString("scourse"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return s;

	}
}

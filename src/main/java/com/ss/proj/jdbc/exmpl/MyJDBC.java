package com.ss.proj.jdbc.exmpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {

	public void getStudentData() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","oracle");

			Statement st = con.createStatement();
			 
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENTS");
			
			System.out.println("SNO" + "-"+"FIRST NAME"+ "-"+"LAST NAME"+ "--"+" ADD "+ "--"+"  GENDER "+ "--"+" SECTION  ");
			System.out.println("******************************************************************************************");
			while(rs.next()){
				System.out.println(rs.getInt(1) + "--"+rs.getString(2)+ "--"+rs.getString(3)+ "--"+rs.getString(4)+ "--"+rs.getString(5)+ "--"+rs.getString(6));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		MyJDBC obj = new MyJDBC();
		obj.getStudentData();
	}
}

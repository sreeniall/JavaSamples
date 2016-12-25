package com.ss.proj.jdbc;

import com.ss.proj.jdbc.exmpl.MyJDBC;

public class JavaToDB {

	public static void main(String[] args) {
		MyJDBC jdbc = new MyJDBC();
		jdbc.getStudentData();
		System.out.println("Done");
		
	}
}

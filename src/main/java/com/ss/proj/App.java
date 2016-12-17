package com.ss.proj;

/**
 * Hello world!
 *
 */
public class App {
		
	
	public static void main(String[] args) {
		
		System.out.println("******* List Of Drivers *******");
		
		
		DriverManager manager = new DriverManager();
		manager.setDriverManager("prathiba", "2017-10-24", 1);
		
		Driver d = manager.getDriverManager();
		
		System.out.println(d.getDriverName() +"###"+ d.getDriverNo()+"###" + d.getLicenceExpiry() );
	}
	
}

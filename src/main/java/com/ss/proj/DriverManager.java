package com.ss.proj;

public class DriverManager {

	Driver d= null;
	
	public void setDriverManager(String driverName, String licenceExpiry, int driverNo) {

		d = new Driver();

		d.setDriverName(driverName);
		d.setLicenceExpiry(licenceExpiry);
		d.setDriverNo(driverNo);

	}
	
	public Driver getDriverManager(){
		return d;
	}

}

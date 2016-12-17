package com.ss.proj;

import junit.framework.TestCase;

public class DriverManagerTest extends TestCase {

	DriverManager dm = null;
	
	protected void setUp(){
		dm = new DriverManager();
	}
	
	public void testSetDriverManager(){
		dm.setDriverManager("sreeni", "2020-12-30", 989889);		
		Driver d = dm.getDriverManager();
		
		
		assertNotNull(d);
		assertEquals("sreeni", d.getDriverName());
		
		
		
	}
	
	protected void tearDown(){
		dm = null;
	}
}

package com.mydemo.logPrint;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrintLogTest {
	 @BeforeSuite
	    public void beforeSuiteLog() {
	        System.out.println("Before Suite: Executing beforeSuiteLog");
	    }

	    @BeforeClass
	    public void beforeClassLog() {
	        System.out.println("Before Class: Executing beforeClassLog");
	    }

	    @BeforeTest
	    public void beforeTestLog() {
	        System.out.println("Before Test: Executing beforeTestLog");
	    }

	    @BeforeMethod
	    public void beforeMethodLog() {
	        System.out.println("Before Method: Executing beforeMethodLog");
	    }

	    // Your test methods here

	    @AfterMethod
	    public void afterMethodLog() {
	        System.out.println("After Method: Executing afterMethodLog");
	    }

	    @AfterTest
	    public void afterTestLog() {
	        System.out.println("After Test: Executing afterTestLog");
	    }

	    @AfterClass
	    public void afterClassLog() {
	        System.out.println("After Class: Executing afterClassLog");
	    }

	    @AfterSuite
	    public void afterSuiteLog() {
	        System.out.println("After Suite: Executing afterSuiteLog");
	    }
	@Test
	public void testPrint() {
		PrintLog echoLog = new PrintLog();
		Assert.assertEquals(echoLog.echo("hello world"),"hello world");
		
	}
		@Test
		public void testWrongPrint() {
			PrintLog echoLog = new PrintLog();
			Assert.assertNotEquals(echoLog.echo("hello world"),"Hello World");
		
	}
}

package com.mydemo.calc;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class MathCalcTest {
	 @BeforeSuite
	    public void beforeSuiteLog() {
	        System.out.println("Before Suite: Executing beforeSuiteMath");
	    }

	    @BeforeClass
	    public void beforeClassLog() {
	        System.out.println("Before Class: Executing beforeClassMath");
	    }

	    @BeforeTest
	    public void beforeTestLog() {
	        System.out.println("Before Test: Executing beforeTestMath");
	    }

	    @BeforeMethod
	    public void beforeMethodLog() {
	        System.out.println("Before Method: Executing beforeMethodMath");
	    }

	    // Your test methods here

	    @AfterMethod
	    public void afterMethodLog() {
	        System.out.println("After Method: Executing afterMethodMath");
	    }

	    @AfterTest
	    public void afterTestLog() {
	        System.out.println("After Test: Executing afterTestMath");
	    }

	    @AfterClass
	    public void afterClassLog() {
	        System.out.println("After Class: Executing afterClassMath");
	    }

	    @AfterSuite
	    public void afterSuiteLog() {
	        System.out.println("After Suite: Executing afterSuiteMath");
	    }
	
	  @Test
	  public void testAddition() {
		  MathCalc calc = new MathCalc();
		  org.testng.Assert.assertEquals(calc.add(2, 2), 4);
	  }
	  @Test
	  public void testSubtraction() {
		  MathCalc calc = new MathCalc();
		  org.testng.Assert.assertEquals(calc.sub(10, 8), 2);
	  }
	 @Test 
	 public void testMultiplication() {
		  MathCalc calc = new MathCalc();
		  org.testng.Assert.assertEquals(calc.mult(4, 4), 16);
	  }
	  
	 @Test
	  public void testDivision() {
		  MathCalc calc = new MathCalc();
		  org.testng.Assert.assertEquals(calc.divide(20, 2), 10);
	  }
}

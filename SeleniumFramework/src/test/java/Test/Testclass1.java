package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testclass1 {

	@BeforeMethod													//before method and after method have scope just within the class so 
																	//these ll not be executed for Testclass2
	public void beforemethod()
	{System.out.println("Before every method I am executed");
	
	}
	@AfterMethod
	public void aftermathod()
	{
		System.out.println("after every method I am executed");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
	System.out.println("Before suite executed");	
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite excecuted");
	}
	
	
	@BeforeTest
	public  void beforetest() {
		System.out.println("I am running before test");
	}

	@AfterTest
	public  void aftertest() {
		System.out.println("I am running after test");
	}

	@Test(groups= {"smoke","regression"})
	public  void test1() {
		System.out.println("Test is executed");
	}

	@Test(groups= {"regression"})
	public  void test2() {
		System.out.println("Test2 is executed");
	}

}

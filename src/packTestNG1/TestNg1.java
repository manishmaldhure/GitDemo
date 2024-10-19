package packTestNG1;

import org.testng.annotations.*;

import org.testng.annotations.Test;

public class TestNg1 {
	@Test
	public void a1()
	{
		System.out.println("Hellow a1 method..");
	}
	
	
	@Test
	public void a2()
	{
		System.out.println("Hellow a2 method..");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method..");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("before class ..");
	}
	@BeforeSuite
	public void bs()
	{
		System.out.println("before suit..");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("before test..");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("after method..");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("after class..");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("after suit..");
	}
	@AfterTest
	public void at()
	{
		System.out.println("after test..");
	}
	
	
	
	
}

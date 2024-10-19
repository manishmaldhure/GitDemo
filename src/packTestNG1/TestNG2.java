package packTestNG1;

import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test(priority = 10)
	public void a3()
	{
		System.out.println("a3 test method..");
	}

	@Test(priority = 2)
	public void z()
	{
		System.out.println("Z method..");
	}
	
	@Test(priority = 2)
	public void ab11()
	{
		System.out.println("ab11 method..");
	}
	
	@Test(priority = 2)
	public void abc()
	{
		System.out.println("abc method..");
	}
	
	
	
}

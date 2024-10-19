package packTestNG1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG3 {
	
	@Test(priority = -10,enabled = false)
	public void a()
	{
		System.out.println("a test method..");
	}
	@Test(priority = 1,invocationCount = 0)
	public void b()
	{
		System.out.println("b test method..");
	}
	@Test(priority = 0)
	public void c()
	{
		System.out.println("c test method..");
	}
	@Test
	public void d()
	{
		
		System.out.println("d test method..");
		throw new SkipException("Skipping this method..");
		
	}

}

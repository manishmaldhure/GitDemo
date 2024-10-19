package packTestNG1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {
	@Test
	public void y()
	{
		
		System.out.println("y test method..");
	}
	
	@Test
	public void z()
	{
		Assert.assertTrue(3<10);
		System.out.println("Z test method..");
	}
	@Test(dependsOnMethods = {"z","y"})
	public void b()
	{
		
		System.out.println("b test method..");
	}
}

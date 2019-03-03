package BasicAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module1 {
	@BeforeClass
	public void beforeModule()
	{
		System.out.println("before module");
	}
	@AfterClass
	public void AfterModule()
	{
		System.out.println("after module");
	}	
	
	@BeforeMethod
	public void beforeTestScript()
	{
		System.out.println("before test script");
	}
	@AfterMethod
	public void afterTestScript()
	{
		System.out.println("after test script");
	}
	
	@Test
	public void test1()
	{
		System.out.println("login test case");
	}
	@Test
	public void test2()
	{
		System.out.println("logout test case");
	}

}

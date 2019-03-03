package BasicAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Module2 {

	@BeforeClass
	public void beforeModule()
	{
		System.out.println("before module2");
	}
	@AfterClass
	public void AfterModule()
	{
		System.out.println("after module2");
	}	
	
	@BeforeMethod
	public void beforeTestScript()
	{
		System.out.println("before test script2");
	}
	@AfterMethod
	public void afterTestScript()
	{
		System.out.println("after test script2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("login test case2");
	}
	@Test
	public void test4()
	{
		System.out.println("logout test case2");
	}
	@BeforeSuite
	public void Beforesuite()
	{
		System.out.println("run before suit");
	}
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("run After suit");
	}
	
}

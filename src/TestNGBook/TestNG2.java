package TestNGBook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestNG2 
{
	@Test
	void test()
	{
	System.out.println("@Test");	
	}
	//@Test(groups={"Smoke Test"})
	//@Test(priority=3)
	@AfterSuite
	void aftersuite()
	{
		System.out.println("AfterSuite");
	}
	@AfterMethod
	void aftermethod()
	{
		System.out.println("Aftermethod");
	}
	//@Test(priority=1)
	@AfterClass
	void afteranno()
	{
		System.out.println("After class");
	}


}

package Priorities;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
/*import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
*/import org.testng.annotations.Test;

public class SequencePriorities 
{
	@Test(priority= 2)
	//@AfterClass
	void VisitGoogle()
	{
		System.out.println("Enter in Google");
	}
	//@AfterMethod
	@Test(priority= 3)
	void Search()
		{
		System.out.println("Search Your Need");
		}
	//@AfterSuite
	@Test(priority= 0)
	void CopyURL()
	{
		System.out.println("Copy URL from Link");
	}

}

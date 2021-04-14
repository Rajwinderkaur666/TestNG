package TestNGAnnotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class AfterAnnotations 
{
@Test
@AfterMethod
void VisitGoogle()
{
	System.out.println("Enter in Google");
}
@AfterClass
void Search()
	{
	System.out.println("Search Your Need");
	}
@AfterSuite
void CopyURL()
{
	System.out.println("Copy URL from Link");
}
}


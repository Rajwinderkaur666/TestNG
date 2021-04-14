package TestNGBook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testtest 
{
@BeforeClass
void URL()
{
	System.out.println("Enter url");
}
@Test(groups= {"Smoke Test"})
@BeforeSuite
void Credentials()
{
	System.out.println("Enter The Credential");
}
@BeforeMethod
void Login()
{
	System.out.println("Login to the web");
}
@BeforeTest
void CheckTitle()
{
System.out.println("To check Title");	
}
@Test(priority=3)
@AfterClass
void DoneCheck()
{
	System.out.println("Done with check");
	
}

@Test
void OutPut()
{
System.out.println("My OutPut iS");	
}
@Test(priority=2)
@AfterSuite
void HomePage()
{
	System.out.println("Enter into a HomePage");
}
@Test(priority=1)
@AfterMethod
void Logout()
{
	System.out.println("Logout From Web");
}


}

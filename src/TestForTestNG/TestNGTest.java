package TestForTestNG;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//show the use of @BeforeSuite and @BeforeTest
public class TestNGTest 
{
    @Test
    @BeforeSuite
    public void testBeforeSuite() 
    {
        System.out.println("testBeforeSuite()");
    }

    @Test
	@AfterSuite
    public void testAfterSuite() 
    {
        System.out.println("testAfterSuite()");
    }

    @Test
	@BeforeTest
    public void testBeforeTest() 
    {
        System.out.println("testBeforeTest()");
    }

}

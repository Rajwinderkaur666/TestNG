package TestNGAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
	WebDriver driver;
	@Test
public void assert1()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Assert.assertEquals(driver.getTitle(), "Hrm");
	System.out.println(driver.getTitle());
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
}
}
//In hard assertion ,if an assertion fails then it abort the test case otherwise it continues
//the execution.Sometimes we want to executes the whole scripts even if the assertion fails .This 
//is not possible in the Hard assertion .To overcomes this situations we need to use the soft assertion. 
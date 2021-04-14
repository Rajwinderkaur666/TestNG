package TestNGAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert 
{
WebDriver driver;
@Test
public void assrt2()
{
	SoftAssert ast=new SoftAssert();
	System.setProperty("webdriver.opera.driver", "D:\\Selenium\\operadriver.exe");
    driver=new OperaDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Assert.assertEquals(driver.getTitle(), "Hrm");
	System.out.println(driver.getTitle());
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
    //ast.assertAll();
}
}
//In hard assertion ,if an assertion fails then it abort the test case otherwise it continues
//the execution.Sometimes we want to executes the whole scripts even if the assertion fails.This 
//is not possible in the Hard assertion.To overcomes this situations we need to use the soft assertion. 
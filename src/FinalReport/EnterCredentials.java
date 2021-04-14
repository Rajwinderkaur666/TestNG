package FinalReport;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class EnterCredentials extends EnterURL 
{
 //WebDriver driver;
 //String path;
@Test//(priority=1)

public void credential()
{

	//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
}


	/*
	 * System.setProperty("webdriver.chrome.driver",
	 * "D:\\Selenium\\chromedriver.exe"); driver=new ChromeDriver();
	 * driver.get("https://www.facebook.com");
	 */
	/*
	 * Thread.sleep(5000);
	 * driver.findElement(By.linkText("Forgotten password?")).click();
	 */
@Test
public void Forget_Pass() {
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.navigate().back();

}
}

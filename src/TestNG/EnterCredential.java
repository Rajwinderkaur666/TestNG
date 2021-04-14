package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EnterCredential //extends LaunchWebPage
{
public static WebDriver driver;
	String path;
	/*String expTitle="OrangHRM",actTitle;
	@Test
	public void CheckTitle()
	{
		actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
	}*/
	@Test
   public void HomePage()
    {
		/*driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
		*/
		path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
		System.out.println("Path"+path);
		driver.get("https://www.facebook.com");
		//driver.get("https://www.amazon.in/");
		
		//step-6 Write username in username text field by using name locator
		driver.findElement(By.id("email")).sendKeys("6280758175");
		
		//step-7 Write username in username text field by using name locator
		driver.findElement(By.id("pass")).sendKeys("Rajwinder@123");
		
		//step-8 Click on login button
	    driver.findElement(By.name("login")).click();
	    
}
    
}

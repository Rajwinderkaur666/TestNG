package FinalReport;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class forgotPWD extends EnterURL 
{
	//WebDriver driver;
	//String path;
//@Test//(priority=2)
/*void forgotpwd() throws InterruptedException
{
	
	 * System.setProperty("webdriver.chrome.driver",
	 * "D:\\Selenium\\chromedriver.exe"); driver=new ChromeDriver();
	 * driver.get("https://www.facebook.com");
	 
	Thread.sleep(5000);
	driver.findElement(By.linkText("Forgotten password?")).click();
}*/
/*
 * @Test void Logout() { driver.findElement(By.name("login")).click(); }
 */
	
	
	@Test
	public void Logout()
	{
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}


}


package FinalReport;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class EnterURL //extends EnterCredentials
{
	static WebDriver driver;
	//static String path;
@BeforeSuite//(priority=0)

public void enterurl()
{
	//giving dynamic path
//path=System.getProperty("use.dir")+"//Browser//chromedriver.exe";
//set dynamic path
//System.setProperty("webdriver.chrome.driver", path);
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
//initialize chromedriver
driver=new ChromeDriver();
//get url(path)from web
driver.get("https://opensource-demo.orangehrmlive.com/");
/*
 * driver.findElement(By.id("email")).sendKeys("6280758175");
 * driver.findElement(By.id("pass")).sendKeys("Rajwinder@123");
 * driver.findElement(By.name("login")).click();
 */
}

/*
 * @AfterSuite public void closebrowser() { driver.close(); }
 */
}
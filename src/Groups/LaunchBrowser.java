package Groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LaunchBrowser 
{
      static WebDriver driver;
      @BeforeSuite(groups= {"Smoke"})	
      public void launch()
       {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	
         }
@AfterSuite(groups= {"Smoke"})
public void close() 
{
driver.close();	
}
}

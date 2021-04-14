package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class LaunchWebPage 
{
public static	WebDriver driver;
	String path;
	@Test
	//@BeforeSuite
	public void Launch()
	{
		//Step-1 Giving Dynamic method to fetch chromedriver
		path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
		
		System.out.println("Path"+path);
		
		//Step-2 set dynamic path
		System.setProperty("webdriver.chrome.driver",path);
		
		//Step-3 Initialize chromedriver
		driver=new ChromeDriver();
		
		//step-4 Open browser in maximize mode
		driver.manage().window().maximize();
		
		//Step-5 open url of applications
		driver.get("https://opensource-demo.orangehrmlive.com/");


}
}
	
	
	



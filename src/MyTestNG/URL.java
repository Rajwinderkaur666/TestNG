package MyTestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class URL 
{
String path;
WebDriver driver;
public	void url()
	{
	//Step-1 Giving Dynamic method to fetch chromedriver
	/*
	 * path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
	 * 
	 * System.out.println("Path"+path);
	 * 
	 * //Step-2 set dynamic path System.setProperty("webdriver.chrome.driver",path);
	 * 
	 * //Step-3 Initialize chromedriver driver=new ChromeDriver();
	 * 
	 * //step-4 Open browser in maximize mode driver.manage().window().maximize();
	 */
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
    driver=new ChromeDriver();
		
		//Step-5 open url of applications
		driver.get("https://www.facebook.com");
	}
		
}

package ParallelDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution 
{
       WebDriver driver;
		String path;
		@Test
		public void Launch() {
			/*
			 * path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
			 * System.setProperty("webdriver.chrome.driver", path);
			 */
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
		}
		@Test
	     public void Launch1() {
				/*
				 * path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
				 * System.setProperty("webdriver.chrome.driver", path);
				 */
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.get("https://www.amazon.com/");
	 		driver.findElement(By.id("nav-signin-tooltip")).click();
	 		driver.findElement(By.id("ap_email")).sendKeys("siddharthrawat995@gmail.com");
	 		driver.findElement(By.id("continue")).submit();
	 		driver.findElement(By.id("ap_password"));

	
		}	
	     @Test
		public void Launch2() {
			/*
			 * path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
			 * System.setProperty("webdriver.chrome.driver", path);
			 */
	    	 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	    	driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
		}
}

package TestNGAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataData 
{
	WebDriver driver;
	String path;
	@DataProvider(name="AfterAnnotations ")
	public Object[][] login()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="6280758175";
		data[0][1]="6280";
		data[1][0]="Rajwinder";
		data[1][1]="Raj";
		
		return data;
	}
	@Test(dataProvider="AfterAnnotations ")
	public void LoginDemo(String uname,String pass) throws InterruptedException
	{
	System.out.println("Username is:"+uname);
	System.out.println(".........");
	System.out.println("Password is:"+pass);
	
       System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
       driver.findElement(By.id("txtUsername")).sendKeys(uname);
	   driver.findElement(By.id("txtPassword")).sendKeys(pass);
	   driver.findElement(By.id("btnLogin")).click();
	 
   }



}

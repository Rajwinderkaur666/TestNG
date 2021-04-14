package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class EnterHomePage extends LaunchWebPage 
{
	WebDriver driver;
	String title;
	String url;
    @Test
	public void Logout()
	{
		/*
		 * driver.findElement(By.linkText("Welcome Paul")).click();
		 * driver.findElement(By.linkText("Logout")).click();
		 */
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     title=driver.getTitle();
         System.out.println("Title of page is:"+title);
         url=driver.getCurrentUrl();
         System.out.println("Current URL of page is:"+url);
        if(title=="https://www.facebook.com")
{
	System.out.println("title is Pass");
}
else
{
	System.out.println("title is Fail");
}

}
}
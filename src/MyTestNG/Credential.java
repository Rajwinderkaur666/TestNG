package MyTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Credential 
{
	WebDriver driver;
public void credential()
{
    driver.findElement(By.id("email")).sendKeys("6280758175");
	//step-7 Write username in username text field by using name locator
	driver.findElement(By.id("pass")).sendKeys("Rajwinder@123");
		
}
}

package MyTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Login 
{
	WebDriver driver;
	public void login()
	{
	driver.findElement(By.name("login")).click();
	}
	public void logout()
	{
		driver.findElement(By.linkText("Forgotten password? ")).click();
	}
}

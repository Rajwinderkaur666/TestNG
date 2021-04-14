package Groups;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logout extends LaunchBrowser
{
	@Test(groups= {"Smoke"})
	public void Logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
	}
}

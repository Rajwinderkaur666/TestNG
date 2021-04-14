package Groups;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class LoginTest extends LaunchBrowser
{
@Test(groups= {"Smoke"})
public void login() throws InterruptedException
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(5000);

}
@Test(groups= {"Sanity"})
public void Forget_Pass() {
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.navigate().back();
}
}

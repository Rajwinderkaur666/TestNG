package TestNGAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class BeforeAnnotation extends AfterAnnotations
{
@Test
@BeforeClass
void PasteURL()
{
	System.out.println("Paste url as a dynamic path");
}
@BeforeMethod
void EnterCredential()
{
	System.out.println("Enter Unmae & Password");	
}
@BeforeSuite
void ForgotPWD()
{
	System.out.println("Enter Click on forgot pwd");
}
}

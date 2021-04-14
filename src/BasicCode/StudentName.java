package BasicCode;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class StudentName 
{
@Test//(dependsOnMethods="Form")
//@BeforeSuite
public void NameStudent()
{
	System.out.println("Rajwinder Kaur");
	System.out.println("Arti");
	System.out.println("Om");
	System.out.println("Shivam");
	System.out.println("Tejasvi");
	System.out.println("Param");
	System.out.println("********");
}
    @Test//(priority=1,dependsOnMethods="Form")
	@AfterSuite
public void TotleStudent()
{
	System.out.println("There are six students in our batch");
}
}

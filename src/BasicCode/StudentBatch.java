package BasicCode;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
public class StudentBatch 
{
	@Test//(dependsOnMethods="From")
	//@BeforeSuite(groups={"Smoke"})//(priority=0)
	
	public void BatchStu()
	{
	System.out.println("We are from SDET/2020/10-01");
	System.out.println("Our Expert is Sampada Jain");
	System.out.println("********");
    }
	
}
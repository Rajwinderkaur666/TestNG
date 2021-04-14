package TestNGAttributes;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class ProvideData 
{
@DataProvider(name="data-provider")
public Object[][] dpMethod()
{
	return new Object[][]{{"First-value"},{"Second-value"}};
}
@Test(dataProvider="data-provider")
public void myTest(String val )
{
	System.out.println("Passed Parameter Is:"+val);
	
}
}

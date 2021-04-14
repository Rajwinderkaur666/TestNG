package PassParameters;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class PassAddParameters 
{

@Parameters({"a","b"})
@Test

void add(int c,int d)
{
	int sum=c+d;
	System.out.println("Sum of two no:"+sum);
}
}

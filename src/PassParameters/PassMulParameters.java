package PassParameters;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassMulParameters 
{
	
	@Parameters({"a","b"})
	@Test
	public void mul(int c,int d)
	{
		int sum=c*d;
		System.out.println("Mul of two no:"+sum);
	}

}

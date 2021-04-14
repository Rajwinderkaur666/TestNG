package ParallelDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AddMulSub 
{
	@Test(dependsOnMethods="Multiplication")
	//(priority=3)for priority purpose
public void Addition()//for parallel purpose
{
	int a=10,b=10,c;
	c=a+b;
	System.out.println("Result is-"+c);
	
}
	@Test//(groups={"Smoke"})//run only those test cases where we apply groups
	//(priority=2)for priority purpose
	//@BeforeSuite //check for @Before annotation purpose
	//@AfterMethod //check for @After annotation purpose
	public void Subtraction()//for parallel purpose
	{
		int a=10,b=10,c;
		c=a-b;
		System.out.println("Result is-"+c);
		
	}
	@Test//(enabled=false)
	//(groups={"Smoke"})//run only those test cases where we apply groups
	//(priority=1)for priority purpose
	public void Multiplication()//for parallel purpose
	{
		int a=10,b=10,c;
		c=a*b;
		System.out.println("Result is-"+c);
		
	}
}

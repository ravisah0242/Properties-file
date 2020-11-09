package skips_with_invocationCount;

import org.testng.annotations.Test;

public class TC1 
{
	@Test
	public void test1()
	{
		System.out.println("Test Case !  **********Test1");
	}
	
	//@Test(enabled=false) // Skip the Test cases;
	@Test(invocationCount=0)  //Skip the Test cases because invocation count default =1;
	//@Test(invocationCount=2)
	public void test2()
	{
		System.out.println("Test Case !  **********Test2");
	}

}

package testngattributes;

import org.testng.annotations.Test;

public class t1 {


@Test(priority=0,description="ONE",groups="two")
public void m1()
{
System.out.println("Test case 1");	
}

@Test(priority=1,description="TWO",groups="two")
public void m2()
{
	System.out.println("Test case 2");	
}
@Test(priority=2,description="Its third",groups="four")
public void ab()
{
	System.out.println("Test case 3");	
}

}
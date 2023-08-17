package testngdependency;

import org.testng.annotations.Test;

public class d2 {
//depends on groups
	
	@Test(priority=0,groups="K")
	public void ab()
	{
		System.out.println("one");
		
	}
	
	@Test(priority=1,groups="K")
	public void bc()
	{
		System.out.println("two");
	}
	
	@Test(priority=2,dependsOnGroups="K")
	public void letters()
	{
		System.out.println("three");
	}
}

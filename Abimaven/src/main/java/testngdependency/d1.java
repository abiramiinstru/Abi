package testngdependency;

import org.testng.annotations.Test;

public class d1 {
//depends on methods: creating connection bw test cases
	
@Test
public void vst(priority=0) 
{
	System.out.println("visiting");
}

@Test

public void lgg(priority=1,dependsOnMethods="visiting")
{
	System.out.println("login");
}
}

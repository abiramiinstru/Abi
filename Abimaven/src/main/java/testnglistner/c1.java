package testnglistner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class c1 implements ITestListener{ //step1 : interface created

	/*ITestListener : it is a builtin interface
	 *Onstart, onfinish, OnTestsuccess, onTestfailure
	 *
	 *Step1  : we have to create interface bw class and testlisner 
	 *		class<=>interface  => class definition =>implements interfacename(ITestListener)
	 * 
	 * Step 2: 
	 * right click=> source => override/implement method => select Onstart, onfinish, Ontestsuccess, Ontestfailur
	 * 
	 * 
	 * Step 3: (hv to do in otherclass testngassertion a1)
	 * 
	 * connect this c1 class with other testngassertion a1 clas
	 * give @Listeners(testnglistner.c1.class) above the class
	 * then  run in the a1class will get messeage for its output like started ,success,finished
	 * 
	 * */
	//step 2 called these 4methods from source
	public void onTestSuccess(ITestResult result) {
	
	System.out.println("Sucesss");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failure");
	}

	public void onStart(ITestContext context) {
		System.out.println("Started!!!");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Finishedddd");
	}

}

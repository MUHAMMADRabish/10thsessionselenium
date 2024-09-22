package Common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class listner extends Reusable implements IListeners {


	public void onTestStart(ITestResult result) throws IOException { 
		
	// TODO Auto-generated method stub 
		screenshots();
	}  
	 
	public void onTestSuccess(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Success of test cases and its details are : "+result.getName());  
	}  
	  
	  
	public void onTestFailure(ITestResult result) throws IOException {  
	// TODO Auto-generated method stub  
	System.out.println("Failure of test cases and its details are : "+result.getName()); 
	screenshots();
	}  
	  
  
	public void onTestSkipped(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	  
  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  
 
	public void onStart(ITestContext context) {  
	// TODO Auto-generated method stub  
	}  
	  
	 
	public void onFinish(ITestContext context) {  
	// TODO Auto-generated method stub  
	}

	@Override
	public Class<? extends ITestNGListener>[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(Class<? extends ITestNGListener>[] value) {
		// TODO Auto-generated method stub
		
	}  
	

}

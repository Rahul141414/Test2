package Listener_Study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener  implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
    Reporter.log("Take Screen Shot After method faile",true);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
	Reporter.log("To Skipped All methods",true);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("After succesful method",true);
	}

}

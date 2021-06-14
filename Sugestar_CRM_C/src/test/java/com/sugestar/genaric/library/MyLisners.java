package com.sugestar.genaric.library;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;



public class MyLisners {
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"  started",true);
	}
	public void onTestSucess(ITestResult result) {
		Reporter.log(result.getName()+"  passed",true);
	}
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"  Failed",true);
	WebDriverCommonLib wb=new WebDriverCommonLib();
	try {
		wb.getFullScreenshot("./ScreenShots/"+result.getName() +".png");
	} catch (Throwable e) {
	   Reporter.log("  failed to take screenshot",true);
		e.printStackTrace();
	}
	}
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" Skiped",true);
	}
	public void onStart1(ITestContext result) {
		Reporter.log(result.getName()+"Test Runner  started",true);
	}
	public void onFinish(ITestContext result) {
	Reporter.log(result.getName()+"test Runner  Finished",true);	
	}

}

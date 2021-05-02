package com.ornageHrm.Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.orangeHrm.base.TestBase;

public class RetryFailedTest extends TestBase implements IRetryAnalyzer  {

	int counter;
	int maxCounter = 1;

	@Override
	public boolean retry(ITestResult result) {
		
		if(counter<maxCounter) {
			
			counter++;
			return true;
		}
		
		return false;
	}

}

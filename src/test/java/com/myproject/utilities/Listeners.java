package com.myproject.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{

		System.out.println("Test started  " +  result.getInstanceName());
	}

	public void onTestSuccess(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS)
		{
			System.out.println("Test success  " +  result.getInstanceName());

		}


	}

	public void onTestFailure(ITestResult result)
	{

		System.out.println("Test failed  " +  result.getInstanceName());
	}

	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test skipped  " +  result.getInstanceName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}







}

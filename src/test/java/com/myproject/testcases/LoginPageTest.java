package com.myproject.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myproject.basetest.Basetest;
import com.myproject.pageobjects.Homepage;
import com.myproject.pageobjects.Loginpage;


public class LoginPageTest extends Basetest{
	
	
	Loginpage loginpage;
	Homepage homepage;
	
	
	@Test(priority =1,groups= {"sanity"})
	public void login1()
	{
		loginpage = new Loginpage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		homepage = new Homepage();
		String actual = homepage.getText();
		String org = "Hello naresh, let's complete the test form:";
		Assert.assertEquals(actual,org);
		
	}
	
	//invalid login details
	@Test(priority =2)
	public void invalidlogin()
	{
		loginpage = new Loginpage();
		loginpage.login();
		homepage = new Homepage();
		String actual = homepage.getText();
		String org = "Hello naresh, let's complete the test form:";
		Assert.assertEquals(actual,org);
		
		
	}

}

package com.myproject.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myproject.basetest.Basetest;
import com.myproject.pageobjects.Homepage;
import com.myproject.pageobjects.Loginpage;



public class HomePageTest extends Basetest{
	
	Loginpage loginpage;
	Homepage homepage;
	
	@Test(priority =3,groups= {"sanity","Regression"})
	public void verifyhomepage()
	{	
		
		loginpage = new Loginpage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		homepage = new Homepage();
		String actual = homepage.getText();
		String org = "Hello naresh, let's complete the test form:";
		Assert.assertEquals(actual,org);
				
		homepage.clicklogout();
		
				
		
	}
	

}

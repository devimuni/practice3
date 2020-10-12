package com.myproject.basepage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.myproject.basetest.Basetest;

public class Basepage extends Basetest {
	
	WebDriver ldriver;
	
	public Basepage(WebDriver driver)
	{
		this.ldriver =driver;
		
	}
	
	
	
	public static void windowmax(WebDriver driver)
	{
		driver.manage().window().maximize();
		
	}
	
	
	public static void pagetimeload(WebDriver driver,int timeout)
	{
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
	}
	
	public static void implicitwait(WebDriver driver,int timeout)
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static void type(WebElement ele,String text)
	{
		ele.sendKeys(text);
		
	}
	
	public static void click(WebElement ele)
	{
		
		ele.click();
	}
	
	public static String getText(WebElement ele)
	{
		
		String text = ele.getText();
		return text;
	}

}

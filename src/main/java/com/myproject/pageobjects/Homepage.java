package com.myproject.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myproject.basepage.Basepage;


public class Homepage extends Basepage{
	
	
	@FindBy(id="greetings")
	private WebElement txtmsg;
	
	@FindBy(id="logout")
	private WebElement logoutbtn;
	
	@FindBy(xpath = "//p[contains(text(),'Feel free')]")
	private WebElement txtmsg2;
	

	
	
	public Homepage()
	{
		
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	public String getText()
	{
		
		String text = Basepage.getText(txtmsg);
		return text;
		
	}
	
	public Loginpage clicklogout()
	{
		
		Basepage.click(logoutbtn);
		return new Loginpage();
	}
	
	public String checkText()
	{
		
		String text2= Basepage.getText(txtmsg2);
		return text2;
	}

}

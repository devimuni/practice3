package com.myproject.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myproject.basepage.Basepage;




public class Loginpage extends Basepage {
	
	
	@FindBy(id = "name")
	private WebElement txtusername;
	
	
	@FindBy(id = "password")
	private WebElement txtpassword;
	
	
	@FindBy(id= "login")
	private WebElement signbtn;
	
	
	@FindBy(className="invalid-feedback")
	private WebElement txtmsg;
	
	
	
	
	public Loginpage()
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public Homepage login(String username, String password)
	{
		
		Basepage.type(txtusername, username);
		Basepage.type(txtpassword, password);
		Basepage.click(signbtn);
		return new Homepage();
		
		
	}
	
	public void login()
	{
		
		Basepage.type(txtusername,"");
		Basepage.type(txtpassword,"");
		Basepage.click(signbtn);
		
	}
	
	public String gettxtmsg()
	{
		
		String text = Basepage.getText(txtmsg);
		return text;
	}
	

}

package com.myproject.basetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.myproject.basepage.Basepage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {

	public static Properties prop;
	//public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	public static WebDriver driver;
	public Basepage action;
	
	/*protected  WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver.get();
	}*/

	@BeforeMethod(groups={"sanity","Regression"})
	@Parameters("browser")
	public void setup(String browsername)
	{
		prop =new Properties();
		FileInputStream input;
		try {
			input = new FileInputStream(System.getProperty("user.dir")+ "\\Configuration\\config.properties");

			prop.load(input);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getStackTrace());
		}
		
		

		//String browsername = prop.getProperty("browser");
		if(browsername.contains("Chrome"))
		{   
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.contains("Firefox"))

		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();

		}
		else if (browsername.contains("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();

		}
		Basepage.windowmax(driver);
		Basepage.pagetimeload(driver, 10);
		Basepage.implicitwait(driver, 10);
		driver.get(prop.getProperty("url"));

		action = new Basepage(driver);
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
		driver.quit();
	}

}

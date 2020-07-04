package com.cucumber.Selenium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions    {
	
	public static WebDriver driver = null;
	public static WebDriverWait waitvar = null;
	public static String baseURl = "https://google.co.in";
	public static String projDir = "C:\\git\\Automation\\Cucumber-maven-automation\\";
	
	public void createDriver() throws  InterruptedException {
	
		
		//chrome Driver
		  System.setProperty("webdriver.chrome.driver", projDir+"chromedriver.exe");
		  driver = new ChromeDriver();
		 
    //firefox
	/*
	  System.setProperty("webdriver.gecko.driver", projDir+"geckodriver.exe");
	  driver = new FirefoxDriver();*/
	//IE
	/*System.setProperty("webdriver.ie.driver", projDir+"IEDriverServer.exe");
	driver = new InternetExplorerDriver();*/
     
     
	
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get(baseURl);
	
	waitvar=new WebDriverWait(driver,5);
	}
	
	public void closeDriver() {
		
		driver.close();
		driver.quit();
	}
	
	public void isHomeDisplayed() {
		
////		waitvar.until(ExpectedConditions.presenceOfElementLocated(By.id("gb_70")));
//		
//		driver.findElement(By.ByLinkText("/account/login?ret=/"))
//		driver.findElement(By.id("gb_70")).isDisplayed();
			
		
		driver.findElement(By.className("dHGf8H"));
	}
	
	public void clickSinginLink() {
		
		driver.findElement(By.className("dHGf8H")).click();
		
	}
	
	public void Register() {
		
		driver.findElement(By.className("dHGf8H")).click();
		
	}
	
	


}

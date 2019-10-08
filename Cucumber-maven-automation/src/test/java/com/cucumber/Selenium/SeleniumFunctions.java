package com.cucumber.Selenium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions    {
	
	public static WebDriver driver = null;
	public static WebDriverWait waitvar = null;
	public static String baseURl = "https://google.co.in";
	
	public void createDriver() throws  InterruptedException {
		
//    //invoke Chrome Driver		
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Cucumber-maven-automation\\chromedriver.exe");		
//	driver = new ChromeDriver();
	//  invoke geckdo driver 
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Cucumber-maven-automation\\geckodriver.exe");
    driver = new FirefoxDriver();
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get(baseURl);
	
	waitvar=new WebDriverWait(driver,5);
	}
	
	public void closeDriver() {
		
		driver.close();
	}
	
	public void isHomeDisplayed() {
		
//		waitvar.until(ExpectedConditions.presenceOfElementLocated(By.id("gb_70")));
		driver.findElement(By.id("gb_70")).isDisplayed();
			
	}
	
	public void clickSinginLink() {
		
		driver.findElement(By.id("gb_70")).click();
		
	}


}

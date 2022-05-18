package com.Baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Baseclass {
	public static WebDriver driver;
	public static Actions ac;
	
	
	//browser launch
	public static WebDriver launchBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver1\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			
		}
		return driver;
		
		
	}
	//get
	public static void urlLaunch(String url){
		driver.get(url);
		
	}
	//close
	public static void closeBrowser() {
		driver.close();
		
	}
	//quit
	public static void quitBrowser() {
		driver.quit();
		}
	//sendkeys
	public static void passInput(WebElement element,String input) {
		element.sendKeys(input);
			}
	//click
	public static void clickOnElement(WebElement element) {
		element.click();
			}
	//screenshot
	public static void screenshotMethods(String location) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dec=new File(location);
		FileUtils.copyFile(src, dec);
		}
	//scroll
	public static void scrollMethod(String element) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element );
			}
	//click
	public static void clickAction(String element) {
		 ac=new Actions(driver);
		ac.click().build().perform();
		
		
	}
	//select by value
	public static void selectthevalue(WebElement element,String value) {
		Select s1=new Select(element);
		s1.selectByValue(value);
		
	}
	//select by index
	public static void selecttheindex(WebElement element,int value) {
		Select s2=new Select(element);
		s2.selectByIndex(value);
	}
	//select by visible text
	public static void selectthevisibletext(WebElement element,String value) {
		Select s3=new Select(element);
		s3.selectByVisibleText(value);
	}
	
	
	
	
	
	
	
		
	

}

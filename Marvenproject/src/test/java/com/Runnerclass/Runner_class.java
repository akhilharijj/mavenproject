package com.Runnerclass;

import org.openqa.selenium.WebDriver;

import com.Baseclass.Baseclass;
import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Runner_class extends Baseclass{
	public static WebDriver driver=launchBrowser("chrome");
	public static Page_Object_Manager pom =new Page_Object_Manager (driver);
	public static void main(String[] args)throws Throwable{
		String url=File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\aaakhilproject\\akhil\\Marvenproject\\Driver1\\chromedriver.exe");
				//WebDriver driver=new ChromeDriver();
				//driver.manage().window().maximize();
				//driver.get("https://adactinhotelapp.com/");
		//username.sendKeys("9080802216");
		//password.sendKeys("akhil@123");
		//login.click();
		
		urlLaunch(url);
		String username=File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		
		
				
				//WebElement username=driver.findElement(By.id("username"));
				
				passInput(pom.getInstanceLogin().getUsername(),username);
				
				//WebElement password=driver.findElement(By.id("password"));
				String password=File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
				
				
				passInput(pom.getInstanceLogin().getPassword(),password);
				
			//WebElement login=driver.findElement(By.id("login"));
				
				clickOnElement(pom.getInstanceLogin().getLogin());
		
		
		
	}

}

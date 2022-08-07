package com.selenium.bridgelabz;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Take_Screenshot_UsingFirefoxBrowser_Test {
	@Test

	public void screenshot() throws InterruptedException ,IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ritesh\\Downloads\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
		 
		 WebDriver driver = new FirefoxDriver();

		  Thread.sleep(4000);
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.name("email")).sendKeys("ritesh786@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("pass")).sendKeys("678976586");
	    Thread.sleep(2000);
	    TakesScreenshot st = (TakesScreenshot) driver;
	    File srcFile=st.getScreenshotAs(OutputType.FILE);
	    
	    File destFile=new File("./ScreenShot/" + "FBscreenshot"+".png");
	    
	    FileHandler.copy(srcFile, destFile);


	
	}

}

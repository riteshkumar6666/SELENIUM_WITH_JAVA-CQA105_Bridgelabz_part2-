package com.selenium.bridgelabz;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Stopwatch;

public class wait_implicit_explicit_UsingFirefox {
	@Test
	public void implicitwaitTest()
	{
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ritesh\\Downloads\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
		 WebDriver driver1 = new FirefoxDriver();
	
	
	 driver1.manage().window().maximize();
	 Stopwatch watch=null;
	 
	 driver1.get("https://sellglobal.ebay.in/seller-center/");
	 
	 //wait of 10 seconds
	 driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 Stopwatch Watch=null;

	
	 try {
		 Watch=Stopwatch.createStarted();
		 
		// driver.findElement(By.linkText("START SELLING")).click();
	 driver1.findElement(By.linkText("wrong  SELLING")).click();
	 }
	 catch(Exception e)
	 {
		 Watch.stop();
		 System.out.println(e);
		 System.out.println(Watch.elapsed(TimeUnit.SECONDS) + "seconds");
	 }
	 
}
	@Test
	public void explicit()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ritesh\\Downloads\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
		
		 WebDriver driver2 = new FirefoxDriver();
		
		
		 driver2.manage().window().maximize();
		 Stopwatch Watch=null;
		 
		 driver2.get("https://sellglobal.ebay.in/seller-center/");
		 
		 WebDriverWait wait=new WebDriverWait(driver2,Duration.ofSeconds(10));
		 try {
			 Watch=Stopwatch.createStarted();
			WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
			element.click();
		  driver2.findElement(By.linkText("START SELLING")).click();
		 //driver.findElement(By.linkText("wrong  SELLING")).click();
		 }
		 catch(Exception e)
		 {
			 Watch.stop();
			 System.out.println(e);
			 System.out.println(Watch.elapsed(TimeUnit.SECONDS) + "seconds");
		 }
		 
	}

}

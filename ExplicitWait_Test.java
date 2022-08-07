package com.selenium.bridgelabz;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Stopwatch;

public class ExplicitWait_Test {
	@Test
	public void explicit()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		 driver.manage().window().maximize();
		 Stopwatch Watch=null;
		 
		 driver.get("https://sellglobal.ebay.in/seller-center/");
		 
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 try {
			 Watch=Stopwatch.createStarted();
			WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
			element.click();
		  driver.findElement(By.linkText("START SELLING")).click();
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

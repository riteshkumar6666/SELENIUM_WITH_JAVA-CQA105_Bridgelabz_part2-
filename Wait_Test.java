package com.selenium.bridgelabz;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.base.Stopwatch;

public class Wait_Test {
	@Test
	public void implicitwait()
	{
		

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	 driver.manage().window().maximize();
	 Stopwatch watch=null;
	 
	 driver.get("https://sellglobal.ebay.in/seller-center/");
	 
	 //wait of 10 seconds
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 Stopwatch Watch=null;

	
	 try {
		 Watch=Stopwatch.createStarted();
		 
		// driver.findElement(By.linkText("START SELLING")).click();
	 driver.findElement(By.linkText("wrong  SELLING")).click();
	 }
	 catch(Exception e)
	 {
		 Watch.stop();
		 System.out.println(e);
		 System.out.println(Watch.elapsed(TimeUnit.SECONDS) + "seconds");
	 }
	 
}
}

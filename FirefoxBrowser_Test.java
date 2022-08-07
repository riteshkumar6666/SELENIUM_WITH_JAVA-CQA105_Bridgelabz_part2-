package com.selenium.bridgelabz;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxBrowser_Test {
	public static WebDriver driver;
	
	public void test() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ritesh\\Downloads\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}
	@Test
	public void simpleAlertPopup() throws InterruptedException
	{
		    driver.get("https://demoqa.com/alerts");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    Thread.sleep(2000);
		    driver.findElement(By.id("alertButton")).click();
		    Thread.sleep(2000);
		    Alert alert=driver.switchTo().alert();
		    alert.accept();
	}

		
	}



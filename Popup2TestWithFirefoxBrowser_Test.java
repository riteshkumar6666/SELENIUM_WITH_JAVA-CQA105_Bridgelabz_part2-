package com.selenium.bridgelabz;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Popup2TestWithFirefoxBrowser_Test {
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{

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
	@Test
	public void confirmationPopUp() throws InterruptedException
	{
		 driver.get("https://in.search.yahoo.com/?fr2=inr");
		    driver.manage().window().maximize();
		    
		    
		    Thread.sleep(2000);
		    driver.findElement(By.name("confirmalertbox")).click();
		    Thread.sleep(2000);
		    
		    // Print the first result
		    Alert confirmationAlert=driver.switchTo().alert();
		    String alertText= confirmationAlert.getText();
		    
		    // Print the first result
		    System.out.println("alert test is: "+alertText);
		   
		    confirmationAlert.accept();
		    
	}
	@Test
	public void PromptPopUp() throws InterruptedException 
	{
	 driver.get("https://demoqa.com/alerts");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.id("promptButton")).click();
    Thread.sleep(2000);
    Alert promptAlert=driver.switchTo().alert();
    Thread.sleep(2000);
    promptAlert.sendKeys("Ritesh");
    Thread.sleep(2000);
    promptAlert.accept();
    

}
	
}

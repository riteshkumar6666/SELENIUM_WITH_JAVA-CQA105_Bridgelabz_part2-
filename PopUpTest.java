package com.selenium.bridgelabz;

import java.io.IOException;  

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopUpTest {
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{

		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Ritesh\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		  driver = new ChromeDriver();
	}
	@Test
	public void simpleAlertPopup() throws InterruptedException
	{
		    driver.get("https://demoqa.com/alerts");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.findElement(By.id("alertButton")).click();
		    Thread.sleep(2000);
		    Alert alert=driver.switchTo().alert();
		    alert.accept();
	}
	@Test
	public void confirmationPopUp() throws InterruptedException
	{
		 driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.findElement(By.name("confirmalertbox")).click();
		    Thread.sleep(2000);
		    Alert confirmationAlert=driver.switchTo().alert();
		    String alertText= confirmationAlert.getText();
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
	@Test
	public void uploadfile() throws InterruptedException, IOException
	
	{
		driver.get("https://www.freepdfconvert.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"top\"]/body/main/div[1]/div/div/div[2]/section/label/div/div[1]/a/span")).click();
		 Thread.sleep(2000);
		 Runtime.getRuntime().exec("D:\\fileScript1.exe");
		 Thread.sleep(2000);
		 driver.close();
	}
	
}

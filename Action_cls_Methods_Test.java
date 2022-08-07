package com.selenium.bridgelabz;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action_cls_Methods_Test {
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ritesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		  driver = new ChromeDriver();
	}
	@Test
	public void test() throws AWTException, InterruptedException 
	{

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement link=driver.findElement(By.linkText("actiTIME Inc."));
		//right click on actitime link
		Actions actions=new Actions(driver);
		actions.contextClick(link).perform();
		Thread.sleep(2000);
		//press w from the keyword for opening in a new windows 
		Robot r=new Robot();
		
		
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void moveToElement() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
	    
		 driver.manage().window().maximize();
		  Thread.sleep(2000);
		  WebElement element =driver.findElement(By.id("email"));
		  Actions actions=new Actions(driver);
		  actions.moveToElement(element).perform();
		  Thread.sleep(2000);
		  WebElement element1=driver.findElement(By.id("pass"));
		  element.click();
		  
		   
	}
	@Test
	public void dragDrop() throws InterruptedException
	{
		driver.get("https://jqueryui.com/droppable/");
		 driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.switchTo().frame(0);
		  WebElement element=driver.findElement(By.xpath("//div[@id='draggable']"));
		  WebElement element1=driver.findElement(By.xpath("//div[@id='droppable']"));
		  Actions actions=new Actions(driver);
		  actions.dragAndDrop(element, element1).perform();
		  actions.clickAndHold(element1).release().perform();
		  actions.moveToElement(element1).release().perform();
		  Thread.sleep(2000);
		  driver.close();
	}
	@Test
	public void keys() throws InterruptedException
	{
		driver.get("http://google.com/");
		 driver.manage().window().maximize();
		  Thread.sleep(2000);
		  WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		  Actions actions=new Actions(driver);
		  actions.keyDown(Keys.SHIFT).perform();
		  Thread.sleep(3000);
		  actions.sendKeys("twitter").perform();
		  Thread.sleep(3000);
		  actions.keyUp(Keys.SHIFT).perform();
		  Thread.sleep(3000);
		  actions.doubleClick(search).perform();
		  Thread.sleep(3000);
          actions.keyDown(Keys.CONTROL).sendKeys("x").perform();
          Thread.sleep(3000);
          
		  
		  
	}
	
	
	

}

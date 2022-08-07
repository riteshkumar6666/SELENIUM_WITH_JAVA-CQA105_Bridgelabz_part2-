package com.selenium.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame_DemoTest{
	@Test
public void test() throws InterruptedException   {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();

driver.get("file:///D:/javaexecuter/page23.html");
//using index of the frame - [ int value] [ index of frames starts with zero]
driver.switchTo().frame(0);
driver.findElement(By.id("t1")).sendKeys("sagar");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.switchTo().defaultContent();
driver.findElement(By.id("t2")).sendKeys("ritesh");
driver.manage().window().maximize();
Thread.sleep(2000);
//using id attribute of the frame -string
driver.switchTo().frame("f1");
driver.findElement(By.id("t1")).sendKeys("b");
driver.switchTo().defaultContent();
driver.findElement(By.id("t2")).sendKeys("b");
//using name attribute of the frame -string
driver.switchTo().frame("n1");
driver.findElement(By.id("t1")).sendKeys("c");
driver.switchTo().defaultContent();
driver.findElement(By.id("t2")).sendKeys("c");
//using address of the frame -webelement
WebElement f = driver.findElement(By.className("c1"));
driver.switchTo().frame(f);
driver.findElement(By.id("t1")).sendKeys("ritesh");
driver.switchTo().defaultContent();
driver.findElement(By.id("t2")).sendKeys("sagar");
driver.close();
}
	
	@Test
	public void frames_usingId() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D://javaexecuter/page23.html");
		//using id attribute of the frame -string
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("Ritesh");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("kumar");
	}
	@Test
	public void frames_usingName () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///D://javaexecuter/page23.html");
		//using name attribute of the frame -string
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("cardano");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("tezos");
	}
	@Test
	public void frames_usingAddressFrame () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ritesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D://javaexecuter/page23.html");
		//using address of the frame -webelement
		WebElement f = driver.findElement(By.className("c1"));
		driver.switchTo().frame(f);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("solana");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("avalanche");
		//driver.close();
	}
	@Test
	public void frames_ThreeTextField() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Ritesh\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D://javaexecuter/page23.html");
		// frames handling for three text field
		//using ID attribute
		driver.switchTo().frame("f1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("Ritesh");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("kumar");
		driver.findElement(By.id("t3")).sendKeys("Sagar");

	}
}	


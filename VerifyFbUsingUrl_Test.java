package com.selenium.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyFbUsingUrl_Test {
	@Test
	public  void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("riteshkumar625.rk@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Rk786@fb");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
 Thread.sleep(3000);
 String expectedUrl = "submit";
 String actualUrl = driver.getCurrentUrl();
 if (actualUrl.contains(expectedUrl)) {
 System.out.println("Home page is displayed");
} 
 else{
System.out.println("Home page is NOT displayed");

}

	}

}


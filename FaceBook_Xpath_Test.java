package com.selenium.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FaceBook_Xpath_Test {
	
	@Test
	public void login ()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("riteshkumar625.rk@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rk786@fb");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("// a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id ='identify_email']")).sendKeys("riteshkumar625.rk@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@name='did_submit']")).click();
//		Thread.sleep(2000);
		
		
		
}
	
	@Test
	public void facebook_signup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Ritesh\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ritesh");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("riteshkumar625.rk@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("riteshkumar625.rk@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Rk786@fb");
		Thread.sleep(2000);
		WebElement dateElement= driver1.findElement(By.xpath("//*[@id='day']"));
		Thread.sleep(2000);
		WebElement monthElement = driver1.findElement(By.xpath("//*[@id='month']"));
		Thread.sleep(2000);
		WebElement yearElement = driver1.findElement(By.xpath("//*[@id='year']"));
		Thread.sleep(2000);
		
		
		Select dateDropdown = new Select(dateElement); 
		Select monthDropdown = new Select(monthElement);
		Select yearDropdown = new Select(yearElement);
		
		dateDropdown.selectByVisibleText("9");
		monthDropdown.selectByVisibleText("Dec");
		yearDropdown.selectByVisibleText("1995");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);
		//driver1.close();
	}
	

}
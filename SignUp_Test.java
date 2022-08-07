package com.selenium.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SignUp_Test {
	@Test
	public void signupFb() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\Ritesh\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//*[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("firstname")).sendKeys("Ritesh");
		Thread.sleep(2000);
		driver1.findElement(By.name("lastname")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver1.findElement(By.name("reg_email__")).sendKeys("Ritesh786@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.name("reg_email_confirmation__")).sendKeys("Ritesh786@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.name("reg_passwd__")).sendKeys("Ritesh567");
		Thread.sleep(2000);
		WebElement dateElement= driver1.findElement(By.name("birthday_day"));
		Thread.sleep(2000);
		WebElement monthElement = driver1.findElement(By.name("birthday_month"));
		Thread.sleep(2000);
		WebElement yearElement = driver1.findElement(By.name("birthday_year"));
		Thread.sleep(2000);
		
		Select d_Dropdown = new Select(dateElement); 
		Select m_Dropdown = new Select(monthElement);
		Select y_Dropdown = new Select(yearElement);
		
		d_Dropdown.selectByVisibleText("9");
		m_Dropdown.selectByVisibleText("Dec");
		y_Dropdown.selectByVisibleText("1996");
		Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("websubmit")).click();
	}
	
}	




package com.selenium.bridgelabz;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Gmail_contextClickDemo_mailArchive_Test {
	@Test
	public void contextClickDemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  Thread.sleep(4000);
	    driver.get("https://mail.google.com/");
		 //enter email id
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sagarritesh50@gmail.com");
		//click on Next button
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(6000);
		//enter password id
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rk786@newgmail");
		//click on Next button
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(10000);
		//Write path expression for the mail item based on a subject
		String xp = "(//b[contains(.,'Following Openings (india)')])[2]";
		//get the address of the mail item which you want to archive
		WebElement mail = driver.findElement(By.xpath(xp));
		//print the subject of the mail
		System.out.println(mail.getText());

		//Creating an object of Actions class
		Actions actions = new Actions(driver);
		//using Actions class object and contextClick() method, right click on the mail item
		actions.contextClick(mail).perform();
		Thread.sleep(6000);
		//click on Archive to archive the mail
		driver.findElement(By.xpath("(//div[@class='J-N-JX aDE aDD'])[1]")).click();
	}

}
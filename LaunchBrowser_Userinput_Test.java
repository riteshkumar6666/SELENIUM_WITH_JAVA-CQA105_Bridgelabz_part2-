
package com.selenium.bridgelabz;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

	public class LaunchBrowser_Userinput_Test {
		
		@Test
		public void launchBrowser_UsingUserinputTest_WithFirefoxBrowser() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Browser name");
			String Browser=sc.nextLine();
			
			System.out.println("user has enter browser name "+Browser);
			WebDriver driver=null;
			
			//if(Browser.equals("chrome"))
			if(Browser.equals("firefox"))
			{
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ritesh\\Downloads\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
			}
			
			
			//WebDriver driver1=new ChromeDriver();
			 WebDriver driver1 = new FirefoxDriver();
		
			driver1.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver1.manage().window().maximize();
			Thread.sleep(2000);
			driver1.findElement(By.name("email")).sendKeys("Ritesh");
			Thread.sleep(2000);
			
			driver1.findElement(By.name("pass")).sendKeys("Ritesh123");
			Thread.sleep(2000);
			
			
			 

	        driver1.close();
		}
		
	}
			



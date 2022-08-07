package com.selenium.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_Browser_Test {
	
	@Test
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println("title of the page is: "+title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println("URL of the page is: "+currentUrl);
		
		String pageSource=driver.getPageSource();
		System.out.println("Source code of the page : "+pageSource);
		//navigate site
		driver.navigate().to("https://www.facebook.com/");

        driver.close();
	}
	
}
		
		


package com.selenium.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Interface_Methods_Test {
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		  driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	   
	    String expectedError="email or mobile number entered is not connected to an account.find your account and log in";
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("email")).sendKeys("riteshkumar625.rk@gmail.com");
	    Thread.sleep(10000);
	    driver.findElement(By.id("pass")).sendKeys("Rk786@fb");
	    Thread.sleep(10000);
	   WebElement element=driver.findElement(By.name("pass"));
	    element.clear();
	    Thread.sleep(10000);
	    
	    driver.findElement(By.id("pass")).sendKeys("Rk786@fb");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).submit();
	    
	     WebElement errorMsg=driver.findElement(By.linkText("find your account and log in "));
	    String actualError=errorMsg.getText();
	    System.out.println("Error message" +actualError);
	    driver.close();
	    
	}
	@Test
	public void AddValueInTextBox_AndRemove() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//entering text into the focussed element
		driver.switchTo().activeElement().sendKeys("admin");
		}
	@Test 
	public void RemoveElementFromTextBox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ritesh786@gmail.com");
		Thread.sleep(2000);
		String value = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		System.out.println("Value present inside the text box is : "+value);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("riteshsagar");
		Thread.sleep(2000);
//		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);  
		//this line will actually delete the value if there is no space in the text entered
		// if there is a space between two words in the username field, we have to use the below lines of code
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.CONTROL+"a") ;
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.DELETE); 
		Thread.sleep(2000);
		}
	@Test
	public void DeleteWothoutUsingClear() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ritesh");
		Thread.sleep(2000);
		String value = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		System.out.println("Value present inside the text box is : "+value);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("againEnteredRitesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		Thread.sleep(2000);
		}
	@Test
	public void ToolTip() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Checkbox = driver.findElement(By.xpath("//input[@type='text']"));
		//get the tooltip text using getAttribute() method and store in a variable
		String tooltipText = Checkbox.getAttribute("title");
		System.out.println(tooltipText);
//		driver.close();
	}
	@Test
	public void isSelected() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement KeepMeLogIN_Checkbox = driver.findElement(By.xpath("//label[contains(text(),'Person With Disability Concession')]"));
	    KeepMeLogIN_Checkbox.click();
		if (KeepMeLogIN_Checkbox.isSelected()) {
			System.out.println("Checkbox is selected");
			}else{
			System.out.println("Checkbox is NOT selected");
			}

}
}

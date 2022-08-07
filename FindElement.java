package com.selenium.bridgelabz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElement {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
//		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\Ritesh\\\\Downloads\\\\geckodriver-v0.31.0-win64\\\\\\\\geckodriver.exe");

		driver = new FirefoxDriver();
		


	}

	@Test
	public void findElements_Example() {
		driver.get("https://www.naukri.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int totalLinks = allLinks.size();
		System.out.println("total number of links present on the web page is : " + totalLinks);
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		for (WebElement link : allLinks) {
			if (link.isDisplayed()) {
				visibleLinkCount++;
				System.out.println(visibleLinkCount + " --> " + link.getText());
			} else {
				hiddenLinkCount++;
			}
		}
		System.out.println("Total number of visible links :" + visibleLinkCount);
		System.out.println("Total number of hidden links :" + hiddenLinkCount);
		driver.close();
	}

	@Test
	public void WebTable_Example() {
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/StudentMarks.html");
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		int totalRows = allRows.size();
		System.out.println("total number of rows present in the table is :" + totalRows);
		List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
		int totalColumns = allColumns.size();
		System.out.println("Total number of columns in the table is :" + totalColumns);
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);
		int countNumberValue = 0;
		int sum = 0;
		for (WebElement cell : allCells) {
			String cellValue = cell.getText();
			try {
				int number = Integer.parseInt(cellValue);
				System.out.print(" " + number);
				countNumberValue++;
				sum = sum + number;
			} catch (Exception e) {
			}
		}
		System.out.println("Total count of numeric values is :" + countNumberValue);
		System.out.println("Total sum of all the numeric values is :" + sum);

//driver.close();
	}
	
}

package com.selenium.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListBox {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Ritesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\Ritesh\\\\Downloads\\\\geckodriver-v0.31.0-win64\\\\\\\\geckodriver.exe");
		driver = new FirefoxDriver();


	}

//	Write a script to select few elements in the list box.
	
	@Test
	public void ListBoxExample() {
		driver.get("D:\\javaexecuter\\ListBox_breakfast.html");
		WebElement list = driver.findElement(By.id("mtr"));
		Select sl = new Select(list);
		List<WebElement> options = sl.getOptions();
		int size = options.size();
		System.out.println("Number of elements present inside the listbox is : " + size);
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}
		sl.selectByIndex(0);
		sl.selectByValue("v");
		sl.selectByVisibleText("Poori");
		System.out.println("*****Print all selected options****");
		List<WebElement> allSelectedOptions = sl.getAllSelectedOptions();
		int size2 = allSelectedOptions.size();
		System.out.println("Number of items that is selected in the list box is : " + size2);
		System.out.println(" Selected items are printed below ");
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		System.out.println("check whether it is a multiple select listbox or not");
		boolean multiple = sl.isMultiple();
		System.out.println(multiple + " yes , it is multi select");
		if (multiple) {
			WebElement firstSelectedOption = sl.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText() + "is the first selected item in the list box");
			sl.deselectByIndex(0);
			WebElement firstSelectedOption1 = sl.getFirstSelectedOption();
			System.out.println(firstSelectedOption1.getText() + " is the first selected item");
			sl.deselectByValue("v");
			WebElement firstSelectedOption2 = sl.getFirstSelectedOption();
			System.out.println(firstSelectedOption2.getText() + " is the first selected item");
			sl.deselectByVisibleText("Poori");
		}

	}
	
//	Write a script to print the content of the list box in sorted order.
	@Test
	public void PrintListValues_SortedOrder() {
			driver.get("D:\\javaexecuter\\ListBox_breakfast.html");
		WebElement listElement = driver.findElement(By.id("mtr"));
		Select s = new Select(listElement);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		System.out.println("-----print the values in the list ----");
		ArrayList<String> list = new ArrayList<String>();
		for (WebElement option : allOptions) {
		String text = option.getText();
		System.out.println(text);
		list.add(text);
		}
		Collections.sort(list);
		System.out.println("-----print the value in sorted order----");
		for (String value : list) {
		System.out.println(value);
		}
		}
	
//	Write a script to print the UNIQUE content of the list box.
	
	@Test
	public void printUniqueElementinthelistbox(){
		driver.get("D:\\javaexecuter\\ListBox_breakfast.html ");
		WebElement listElement = driver.findElement(By.id("mtr"));
		Select s = new Select(listElement);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		System.out.println("-----print the values in the list ----");
		HashSet<String> allElements = new HashSet<String>();
		for (WebElement option : allOptions) {
		String text = option.getText();
		System.out.println(text);
		allElements.add(text);
		}
		System.out.println(allElements);
		}
		
//	Write a script to print the UNIQUE content of the list box in SORTED order
	
	@Test
	public void printUniqueElement_Sorted (){
		driver.get("D:\\javaexecuter\\ListBox_breakfast.html ");
		WebElement listElement = driver.findElement(By.id("mtr"));
		Select s = new Select(listElement);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		System.out.println("-----print the values in the list ----");
		TreeSet<String> allElements = new TreeSet<String>();
		for (WebElement option : allOptions) {
		String text = option.getText();
		System.out.println(text);
		allElements.add(text);
		}
		System.out.println(allElements);
		}
		
	
//	Write a script to check whether listbox has duplicate or not ?
	@Test
	public void checklisthasDUPLICATEvalues_HashSet() {
				driver.get("D:\\javaexecuter\\ListBox_breakfast.html ");
		 WebElement listbox = driver.findElement(By.id("mtr"));
		 Select s = new Select(listbox);
		 List<WebElement> allOptions = s.getOptions();
		 int count1 = allOptions.size();
		 System.out.println("Number of elements in the list is :" +count1);
		 HashSet<String> allElementText = new HashSet<String>();
         for (int i = 0; i < count1; i++) {
		 String text = allOptions.get(i).getText();
		 System.out.println(text);
		 allElementText.add(text);
		 }
		 int count2 = allElementText.size();
		 System.out.println("Number of elements in the hashset is :" +count2);
		 if (count1==count2) {
		 System.out.println("list box has NO duplicate values");
		 }
		 else{
		 System.out.println("list box has duplicate values");
		 }
		 System.out.println(allElementText);
		 driver.close();
		 }
		
	
//	Write a script to print the duplicate item in the list ?
	
	@Test
	public void PrinttheDUPLICATEItem_intheList_HashSet() {
		driver.get("D:\\javaexecuter\\ListBox_breakfast.html");
		 WebElement listbox = driver.findElement(By.id("mtr"));
		 Select s = new Select(listbox);
		 List<WebElement> allOptions = s.getOptions();
		 int count1 = allOptions.size();
		 System.out.println("Number of elements in the list is :" +count1);
		 HashSet<String> allElementText = new HashSet<String>();
		 for (int i = 0; i < count1; i++) {
		 String text = allOptions.get(i).getText();
		 if (!allElementText.add(text)) {
		 System.out.println(text +" is the duplicate item in the list box");
		 }
		 }
		 System.out.println(allElementText.size());
		 System.out.println(allElementText);
		// driver.close();
		 }
		
//	Print the number of occurrance of Poori in the list box.
	@Test
	public void HashMapExample_printtheOcuuranceOfPoori() {
		driver.get("D:\\javaexecuter\\ListBox_breakfast.html");
		WebElement list = driver.findElement(By.id("mtr"));
		Select s = new Select(list);
		List<WebElement> allElements = s.getOptions();
		HashMap<String, Integer> hashMapObj = new HashMap<String, Integer>();
		for (WebElement element : allElements) {
			String text = element.getText();
			if (hashMapObj.containsKey(text)) {
			Integer value = hashMapObj.get(text);
			value++;
			hashMapObj.put(text, value);
			}else{
			hashMapObj.put(text, 1);
			}
			}
			Set<String> allKeys = hashMapObj.keySet();
			for (String key : allKeys) {
			Integer value = hashMapObj.get(key);
			System.out.println(key +" -->"+ value);
			if (value>1) {
			System.out.println("Occurance of " + key + " is :" + value);
			}

			}
	}
}
	
			

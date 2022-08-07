package com.selenium.bridgelabz;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Keyboard_Mouse_Operations_Test{
public void  test() throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

    driver.navigate().to("https://www.facebook.com/");

Thread.sleep(5000);

Robot r = new Robot();

r.mouseMove(300, 500);

r.keyPress(KeyEvent.VK_ALT);

r.keyPress(KeyEvent.VK_F);

r.keyRelease(KeyEvent.VK_F);

r.keyRelease(KeyEvent.VK_ALT);
Thread.sleep(3000);
//Press W key from keyboard to open a new private window
r.keyPress(KeyEvent.VK_W);
//Release W key from keyboard
r.keyRelease(KeyEvent.VK_W);
Thread.sleep(3000);

driver.quit();
}
}


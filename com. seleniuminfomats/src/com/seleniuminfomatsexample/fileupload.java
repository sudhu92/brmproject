package com.seleniuminfomatsexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.grammarly.com/plagiarism-checker");
		driver.manage().window().maximize(); 
		
		JavascriptExecutor ex=(JavascriptExecutor) driver;
		ex.executeScript("window.scroll(0,200)","");
		Thread.sleep(3000);
		
	WebElement upload=driver.findElement(By.xpath("//*[text()='Upload a file']"));	
		upload.click();		
		Robot robo = new Robot();
		StringSelection selection=new StringSelection("C:\\Users\\sudha\\OneDrive\\Desktop\\download (1).JPEG File (.jpeg)");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);

		robo.keyPress(KeyEvent.VK_CONTROL);//vk mean virtual key onscreen keyboard tha press pannum so only
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
	}

}



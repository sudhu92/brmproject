package com.seleniuminfomatsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeexam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				driver.get("https://www.leafground.com/frame.xhtml");
				driver.manage().window().maximize();
				
				driver.switchTo().frame(0);
				driver.findElement(By.id("Click")).click();
				driver.switchTo().defaultContent();
				Thread.sleep(3000);
	 	int count =  driver.findElements(By.tagName("iframe")).size();
	 	System.out.println(count);
	 	Thread.sleep(3000);
	 	JavascriptExecutor ex=  (JavascriptExecutor)driver;
		ex.executeScript("window .scrollBy(0,400)","");
		driver.switchTo().frame(2);

		driver.findElement(By.id("Click")).click();
	 
	 	  
			
			
				
				

	}

}

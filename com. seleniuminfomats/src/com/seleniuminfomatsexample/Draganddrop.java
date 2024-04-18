package com.seleniuminfomatsexample;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Draganddrop {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();


		WebElement  d=	driver.findElement(By.id("form:conpnl"));
		Actions a = new Actions(driver);

		a.dragAndDropBy(d , 300, 0).build().perform();
		//	JavascriptExecutor ex=(JavascriptExecutor) driver;
		//	ex.executeScript("window.scroll(0,600)", "");

		WebElement source= 	driver.findElement(By.id("form:drag_content"));
		WebElement target = driver.findElement(By.id("form:drop_header"));
		a.dragAndDrop(source, target).build().perform();
	}

}

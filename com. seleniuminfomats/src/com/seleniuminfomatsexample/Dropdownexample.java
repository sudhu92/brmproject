package com.seleniuminfomatsexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement dropdownfav = driver.findElement(By.className("ui-selectonemenu"));
		Select sct = new Select(dropdownfav);
		Thread.sleep(3000);
		sct.selectByVisibleText("Selenium");
		List<WebElement> sizeoption =sct.getOptions();
	int  size = sizeoption.size();
		System.out.println(size);
		
	}

}

package com.seleniuminfomatsexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slectable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize(); 
		driver.switchTo().frame(0);
		List<WebElement> sctble = driver.findElements(By.xpath("//ol[@id='selectable']//li"));
		Actions  act = new Actions(driver);

//		act.clickAndHold(sctble .get(0)).
//
//		clickAndHold(sctble.get(1)).
//		clickAndHold(sctble.get(3)).
		act.keyDown(Keys.CONTROL).click(sctble.get(0)).
		click(sctble.get(1)).
		click(sctble.get(4)).
		build().perform();

		


	}
}

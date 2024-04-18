package com.seleniuminfomatsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3textbox {
	public void race () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a"));
		element.click();
		WebElement tbox=	driver.findElement(By.xpath("//*[@id=\"menuform:m_input\"]/a/span"));
		tbox.click();
		WebElement namebox= driver.findElement(By.name("j_idt88:name"));
		namebox.sendKeys("sudharshan");
		WebElement apppendbox = driver.findElement(By.id("j_idt88:j_idt91"));
		apppendbox.sendKeys("chennai");
		WebElement disabledbox= driver.findElement(By.name("j_idt88:j_idt93"));
		boolean value = disabledbox.isEnabled();
		System.out.println(value);
		WebElement cleartext= driver.findElement(By.name("j_idt88:j_idt95"));
		cleartext.clear();
		WebElement reterive = driver.findElement(By.name("j_idt88:j_idt97"));
		String rtrvelement = reterive.getAttribute("value");
		System.out.println(rtrvelement);
		driver.navigate().to("https://www.leafground.com/input.xhtml");
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.quit();
		}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Day3textbox st = new Day3textbox();
		st.race();

	}

}

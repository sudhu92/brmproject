package com.seleniuminfomatsexample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class Windowhandleexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
	String	oldwindow = driver.getWindowHandle();
		
		
	 driver.findElement(By.id("j_idt88:new")).click();
	 Set<String> allwin= driver.getWindowHandles();
		 for (String newwin : allwin) {
			 driver.switchTo().window(newwin);
			
			}
		 
		 driver.findElement(By.id("menuform:j_idt43")).click();
		 Thread.sleep(1500);
		
		 
		driver.findElement(By.xpath("//*[@id='menuform:m_message']/a/i")).click();
		 
		 driver.switchTo().window(oldwindow);
		 driver.findElement(By.id("j_idt88:j_idt91")).click();
		 Thread.sleep(1500);
	
		int count = driver.getWindowHandles().size();
		System.out.println(count);
		
		
	 Set<String> totalwin=	driver.getWindowHandles();
for (String extrawin : totalwin) {
	if(!extrawin.equals(oldwindow))
	driver.switchTo().window(extrawin).close();
	Thread.sleep(3000);
	
}
	}

}

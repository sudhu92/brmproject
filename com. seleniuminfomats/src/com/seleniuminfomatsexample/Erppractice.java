package com.seleniuminfomatsexample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Erppractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://brm.tremplintech.in/web_pages/login.aspx");
	WebElement usernamefield = 	driver.findElement(By.id("txt_unam"));
	usernamefield.sendKeys("sylix");
	WebElement passwordfeild =	driver.findElement(By.id("txt_pass"));
	passwordfeild.sendKeys("admin");
	WebElement loginbutton =	driver.findElement(By.id("Button3"));
	loginbutton .click();	
	WebElement customerlinktext = driver.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a"));
	customerlinktext.click();
	
	Alert a = driver.switchTo().alert();
	a.accept();
	WebElement comname = driver.findElement(By.id("ContentPlaceHolder1_txt_compname"));
	comname.sendKeys("infomats techno");
	WebElement mobnum = driver.findElement(By.id("ContentPlaceHolder1_txt_cntname"));
	mobnum.sendKeys("8778317740");
	WebElement address = driver.findElement(By.id("ContentPlaceHolder1_txt_addr"));
	address.sendKeys("salem,tamilnadu");
	WebElement designationfield = driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_txt_cntdsgn\']"));
	designationfield .sendKeys("manager");
	WebElement Statefield = driver.findElement(By.id("ContentPlaceHolder1_ddl_state"));
	Select sect = new Select(Statefield);
	sect.selectByValue("Tamil Nadu");
	//driver.navigate().back();
//	WebElement searcfiled = driver.findElement(By.xpath("//*[@id=\'ContentPlaceHolder1_txt_src\']"));
	
//	searcfiled.sendKeys("CUS001372");
	
	}

}

package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {

		@BeforeMethod
		public void abc () {
			System.out.println("at before method");
		}
		@BeforeTest
		public void def () {
			System.out.println("at test");
		}@AfterMethod
		public void ghi() {
			System.out.println("at after method");
		}@AfterTest
		public void jkl() {
			System.out.println("at after test");
		}@BeforeClass
		public void mno() {
			System.out.println("at before class");

		}@AfterClass
		public void pqr() {
			System.out.println("after class");

		}@BeforeSuite
		public void stu () {
			System.out.println("at before suit");
		}
		@AfterSuite
		public void vwx () {
			System.out.println("at after suit");
		}
		@Test
public void rr() {
	System.out.println(123);
}

	}


  

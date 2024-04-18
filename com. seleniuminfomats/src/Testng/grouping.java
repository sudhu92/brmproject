package Testng;

import org.testng.annotations.Test;

public class grouping {
	@Test(groups= {"login"})
	public void login() {
		System.out.println("login first");
	}
	@Test(groups= {"add"})
	public void addcustomer() {
		System.out.println("add customer");
	}
	@Test(groups= {"serch"})
	public void searchcustomer() {
		System.out.println("search customer");
	}
	@Test(groups= {"close"})
	public void logout (){
		System.out.println("finally logout");
	}
	
}






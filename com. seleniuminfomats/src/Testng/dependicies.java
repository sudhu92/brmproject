package Testng;

import org.testng.annotations.Test;

public class dependicies {
	@Test(enabled= true)
	public void father() {
		System.out.println("print father");
	}
	@Test(dependsOnMethods = "father")
	public void mother() {
		System.out.println("print mother");
		
	}
	@Test(dependsOnMethods = "mother")
	public void son () {
		System.out.println("print son");
	}
	@Test
	public void daughter() {
		System.out.println("print daughter");
	}
	@Test
	public void bothmarriage() {
		System.out.println("print bothmarriage");
	}
}

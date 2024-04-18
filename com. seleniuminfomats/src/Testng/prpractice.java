package Testng;

import org.testng.annotations.Test;

public class prpractice {

	@Test(priority =1)
	public void name () {
		System.out.println("print  name");
	}
	@Test(priority =2)
	public void education() {
		System.out.println("print  education");

	}
	@Test(priority =3)

	public void school() {
		System.out.println("print school");
	}
@Test(priority =4)
	public void college() {
		System.out.println("print college");
	}
	@Test(priority =5)
	public void job() {
		System.out.println("print job");
	}
}

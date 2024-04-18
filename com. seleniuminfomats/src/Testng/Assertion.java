package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	String  name = "sudharshan";
	//boolean value = false;
	@Test
	public void checkassert() {
	//	Assert.assertEquals(name, "sudhu");
	//	Assert.assertNotEquals(name, "Sudhu");
	//	Assert.assertFalse(value, name);
		Assert.assertEquals(name, "sudhu");
	}
    
}

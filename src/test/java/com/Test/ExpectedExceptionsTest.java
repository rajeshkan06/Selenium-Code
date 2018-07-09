package com.Test;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.Test;

public class ExpectedExceptionsTest {
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test() {
		
		String a = "100A";
		Integer.parseInt(a);
		
		
	}

}

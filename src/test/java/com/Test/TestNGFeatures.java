package com.Test;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void login() {
		System.out.println("Login page");
//		int i = 9/0;
//		System.out.println(i);
	}
	
	@Test(dependsOnMethods="login")
	public void homePage() {
		System.out.println("Home page");
	}
	
	@Test(dependsOnMethods="login")
	public void searchPage() {
		System.out.println("Search page");
	}
}

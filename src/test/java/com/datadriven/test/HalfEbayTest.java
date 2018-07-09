package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.test.TestUtil;

public class HalfEbayTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:/Chrome driver/chromedriver.exe/");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.in/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.in%2F");	
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData(){
		ArrayList<Object[]> testData = TestUtil.getTestDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void halfEbayRegPageTest(String firstName, String lastName, String emailId, String password ) {
		
		//enter data:
		
		driver.findElement(By.cssSelector("input[name='firstname']")).clear();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(firstName);
		
		driver.findElement(By.cssSelector("input[name='lastname']")).clear();
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(lastName);
		
		driver.findElement(By.cssSelector("input[name='email']")).clear();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys(emailId);
		
		driver.findElement(By.cssSelector("input[name='PASSWORD']")).clear();
		driver.findElement(By.cssSelector("input[name='PASSWORD']")).sendKeys(password);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

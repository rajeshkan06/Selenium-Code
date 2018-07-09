package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {
		
		WebDriver driver;
		
	//WebDriver code:
			System.setProperty("webdriver.chrome.driver", "D:/Chrome driver/chromedriver.exe/");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://reg.ebay.in/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.in%2F");
			
		//Data Driven approach( is also called Parameterization) - used to create a data driven framework: driving the 
			//test data from excel file or from other sources.
			
		
				
		//get test data from excel:
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\css100409\\eclipse-workspace\\SeleniumAutomationSessions\\src\\test\\java\\com\\testdata\\HalfEbayTestData.xlsx");
		int rowCount = reader.getRowCount("RegTestData");
		
		reader.addColumn("RegTestData", "status");
		
		//Parameterization:
		for(int rowNum=2; rowNum<=rowCount; rowNum++) {
			System.out.println("************");
			String firstName = reader.getCellData("RegTestData", "firstname", rowNum);
			System.out.println(firstName);
			
			String lastName = reader.getCellData("RegTestData", "lastname", rowNum);
			System.out.println(lastName);
			
			String email = reader.getCellData("RegTestData", "email", rowNum);
			System.out.println(email);
			
			String password = reader.getCellData("RegTestData", "password", rowNum);
			System.out.println(password);
			
			//enter data:
			
			driver.findElement(By.cssSelector("input[name='firstname']")).clear();
			driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(firstName);
			
			driver.findElement(By.cssSelector("input[name='lastname']")).clear();
			driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(lastName);
			
			driver.findElement(By.cssSelector("input[name='email']")).clear();
			driver.findElement(By.cssSelector("input[name='email']")).sendKeys(email);
			
			driver.findElement(By.cssSelector("input[name='PASSWORD']")).clear();
			driver.findElement(By.cssSelector("input[name='PASSWORD']")).sendKeys(password);
			
			reader.setCellData("RegTestData", "status", rowNum, "Pass");
			
			
		}
		
		driver.quit();
		
		

	}

}

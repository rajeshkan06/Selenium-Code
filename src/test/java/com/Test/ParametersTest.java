package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser", "url", "emailId"})
	public void yahooLoginTest(String browser, String url, String emailId) {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:/Chrome driver/chromedriver.exe/");
		driver = new ChromeDriver();
		}else if(browser.equals("fireFox")) {
			System.setProperty("webdriver.gecko.driver", "D:/Chrome driver/geckodriver.exe/");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[id='login-username']")).sendKeys(emailId);
		driver.findElement(By.cssSelector("input[id='login-signin']")).click();
	}

}

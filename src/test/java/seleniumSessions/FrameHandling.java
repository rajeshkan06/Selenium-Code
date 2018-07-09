package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:/Chrome driver/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.switchTo().frame("intercom-borderless-frame");
		driver.findElement(By.cssSelector("div[class='intercom-borderless-dismiss-button']")).click();
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
		Thread.sleep(5000);
		driver.close();
	
		
		

	}

}

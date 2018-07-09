package seleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Chrome driver/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowId = it.next();
		System.out.println("Parent window id: " +parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child window id: " +childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println("Child window title "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window title "+driver.getTitle());
		driver.close();
		
		
		
		
		

	}

}

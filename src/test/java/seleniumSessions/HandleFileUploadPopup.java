package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:/Chrome driver/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://html.com/input-type-file/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.cssSelector("a[title='Close']")).click();
		
		driver.findElement(By.cssSelector("input[id='fileupload']")).sendKeys("D:/ruff.txt");
		
		//driver.close();
	}

}

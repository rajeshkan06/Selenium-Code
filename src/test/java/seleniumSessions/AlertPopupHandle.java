package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Chrome driver/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		alert.accept();// click the ok button in alert popup
		
		//alert.dismiss();// click the cancel button in alert popup
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct text message");
			
		}else {
			System.out.println("Incorrect text message");
		}
		
		driver.close();
		
		
	
		
	}

}

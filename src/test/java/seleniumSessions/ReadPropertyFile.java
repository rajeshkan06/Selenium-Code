package seleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\css100409\\eclipse-workspace\\SeleniumAutomationSessions\\src\\test\\java\\seleniumSessions\\config.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("browser"));
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/Chrome driver/chromedriver.exe/");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("URL"));
			driver.quit();
		}
		
		
	}

}

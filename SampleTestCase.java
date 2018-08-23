package businesscomponents;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class SampleTestCase {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		
		
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\726744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sweb-owners.hyundaiusa.com/us/en/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		SampleTestCase.isPopupPresent(driver);
		driver.findElement(By.xpath("//a[@id='link-register-home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).sendKeys("Test");
		driver.findElement(By.id("last_name")).sendKeys("Test");
		/*String mailId = RandomString.generate(5);
		System.out.println("test"+mailId+"@yopmail.com");*/
		WriteExcel.writeDataFromExcel();
	
		
		String mailId1 = ReadExcel.readDataFromExcel();
		String password = RandomString.generate(6);
		driver.findElement(By.id("email_address")).sendKeys(mailId1);
		driver.findElement(By.id("email_address_confirm")).sendKeys(mailId1);
		driver.findElement(By.id("signup_pwd")).sendKeys("Agced"+password);
		driver.findElement(By.id("signup_confirm_pwd")).sendKeys("Agced"+password);
		driver.findElement(By.id("zipcode")).sendKeys("60001");
		SampleTestCase.isPopupPresent(driver);
		driver.findElement(By.id("btn-reg-form")).click();
		//Thread.sleep(8000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btnKeepEmail']")));
		driver.findElement(By.xpath("//*[@id='btnKeepEmail']")).click();
		Thread.sleep(4000);		
		/*Select select = new Select(driver.findElement(By.id("security_question")));
		select.selectByVisibleText("What's your favorite pet's name?");
		select.selectByIndex(0);*/		
		List<WebElement> securityQuestionsList = driver.findElements(By.xpath("//select[@id='security_question']/option"));	
		for(WebElement list : securityQuestionsList) {
			if(list.getText().equals("What's your favorite pet's name?")) {
				list.click();
			}}
		driver.findElement(By.id("security_answer")).sendKeys("Rajesh");
		Thread.sleep(2000);
		driver.findElement(By.id("agree_terms")).click();
		driver.findElement(By.id("join_rewards")).click();
		driver.findElement(By.id("btnsbmt_regform")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Welcome to MyHyundai | MyHyundai");	
	}
	
	public static void isPopupPresent(WebDriver driver) {	  
	    try {
	       	WebElement popup =driver.findElement(By.cssSelector("area[alt='no']"));
	       	popup.click();
	    } 
	    catch (Exception e) {

	    }	    
	}
	
	
	


}

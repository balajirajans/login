package gmailopen;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
;

	
	public class LoginPage {

		public static void main(String[] args) // call the Chrome driver as below first 
		{
			//System.setProperty("webdriver.firefox.driver", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
			File pathToBinary = new File("D:\\Program Files\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
			FirefoxProfile firefoxProfile = new FirefoxProfile();       
			WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
			 driver.get("https://www.gmail.com");
		      driver.findElement(By.id("Email")).sendKeys("indianbalaji2020");
			   driver.findElement(By.id("next")).click();
		       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			   driver.findElement(By.id("Passwd")).sendKeys("8754818273");
		       driver.findElement(By.id("signIn")).click();
		         
		      // WebDriverWait wait = new WebDriverWait(driver, 10);
		       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profile")));
		       //String Expected=driver.findElement(By.id("message")).getText();
		       //Assert.assertEquals(Expected, "Welcome");
		    
		}
		
		
	}




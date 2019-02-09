package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyEdurekaPage {
	
	WebDriver driver;
	@BeforeMethod
	public void launch() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://52.14.219.170:3001/");
	}
	
	
  @Test
  public void loginPage() {
	  driver.findElement(By.name("login")).sendKeys("devops");
	  driver.findElement(By.name("password")).sendKeys("test");
	  driver.findElement(By.name("click")).click();
  }
  
  @AfterMethod
  public void close() {
	  driver.close();
  }
}

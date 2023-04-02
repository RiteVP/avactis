package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AssignmentCookbookRadioChekcboxButtonTest {
	
	WebDriver driver;
  @Test
  public void printingFlipkartLinks() throws InterruptedException {
	driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	   
	WebElement radio = driver.findElement(By.xpath("//input[@value='Diesel']"));
	radio.click();
	@SuppressWarnings("unused")
	WebElement check = driver.findElement(By.xpath("//input[@value='ABS']"));
	radio.click();
  }
    
  @BeforeMethod
  public void beforeMethod() { 
	  driver = new ChromeDriver();
	  driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
	 }
  

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}

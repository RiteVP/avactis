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

public class AssignmentFlipkart {
	
	WebDriver driver;
  @Test
  public void printingFlipkartLinks() throws InterruptedException {
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	   
	List <WebElement> allFlipkartLinks = driver.findElements(By.tagName("a"));
	int size = allFlipkartLinks.size();
	System.out.println(size);
	
	for (WebElement oneLink:allFlipkartLinks) {
		System.out.println(oneLink.getText());	  	
  }
  }	
    
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
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

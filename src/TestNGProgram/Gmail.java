package TestNGProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Gmail {
	
	public WebDriver driver;
	
  @Test
  public void login() {
	  
	  
  }
  
  
  @Test
  public void compose() {
	  
	  
	  
	  
	  
  }
  
  @Test
  public void logout() {
	  
	  
  }
  
  
  
  @BeforeTest
  public void openurl() {
	  
	  
	  driver = new FirefoxDriver();
	  driver.get("http://gmail.com");
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}

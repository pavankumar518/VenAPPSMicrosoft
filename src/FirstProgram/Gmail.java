package FirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	///WebDriver driver = new webdriver;
	
WebDriver driver;
	
	
	public void openurl(){
		
		
		driver = new ChromeDriver();
	driver.get("http://gmail.com");
		
		
	}
	
	
	public void login() {
		
		
		driver.findElement(By.id("identifierId")).sendKeys("balaji@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		
		
	}
	


	public static void main(String[] args) {
		

	}

}

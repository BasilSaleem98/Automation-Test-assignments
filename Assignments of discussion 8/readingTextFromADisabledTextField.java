package QABootcampMavenTNGD8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class readingTextFromADisabledTextField {
	
	public WebDriver driver ; // Declare the WebDriver instance
	@Test
	public void readTextButton() {
		
	driver =new EdgeDriver();// Initialize the edge drive 
	driver.manage().window().maximize(); // Maximize the browser window 
	driver.get("https://omayo.blogspot.com/"); // Navigate to the target URL 
	
	WebElement btn1 = driver.findElement(By.xpath("//button[@id='but1']"));
	System.out.println("Value of Button 1 is: "+btn1.getText()); // get the value of Button 1
	
	
	
	}
	
}

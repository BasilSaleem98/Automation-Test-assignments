package QABootcampMavenTNGD8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class pressingReturnKeyAfterEnteringAValueInTextField {

	public WebDriver driver ; // Declare the WebDriver instance
	
	@Test
	public void fillTextBox() throws InterruptedException {
		
	driver =new EdgeDriver();// Initialize the edge drive 
	driver.manage().window().maximize(); // Maximize the browser window 
	driver.get("https://omayo.blogspot.com/"); // Navigate to the target URL 
	
	WebElement textBox = driver.findElement(By.xpath("//textarea[@id='ta1']"));
	textBox.sendKeys("Hi Im Basil Saleem ");
	Thread.sleep(500);
	textBox.click();
	
	}
	
}

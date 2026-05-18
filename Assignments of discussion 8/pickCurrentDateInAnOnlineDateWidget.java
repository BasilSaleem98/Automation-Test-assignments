package QABootcampMavenTNGD8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class pickCurrentDateInAnOnlineDateWidget {
	
	public WebDriver driver ; // Declare the WebDriver instance
	
	@Test
	public void datePick() throws InterruptedException
	{
		
	driver =new EdgeDriver();// Initialize the edge drive 
	driver.manage().window().maximize(); // Maximize the browser window 
	driver.get("https://jqueryui.com/datepicker/"); // Navigate to the target URL 
	
	// Switch to the frame containing the Date section
	driver.switchTo().frame(0); 
	
	System.out.println("the cuurrent date will be in a seconds");
	Thread.sleep(1500);
	
	//Catch the Date webelement
	WebElement date = driver.findElement(By.xpath("(//input[@id='datepicker'])"));
	date.click();
	Thread.sleep(500);
	date.sendKeys("05/18/2026"); //send the current date
	Thread.sleep(100);
	date.sendKeys(Keys.ENTER); //simulate real enter
	
	}

	
	
	
	
	
	
	
	
	
}

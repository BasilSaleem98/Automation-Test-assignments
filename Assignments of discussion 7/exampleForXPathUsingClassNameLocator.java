package QABootcampMaven.axsosD7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.edge.EdgeDriver;


public class exampleForXPathUsingClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		//instantiation of driver 
		WebDriver driver = new EdgeDriver(); 
		//Launch website 
		driver.get("https://www.saucedemo.com/"); 
		
		//username
		WebElement id=driver.findElement(By.xpath("//input[@id=\"user-name\"]")); 
		id.sendKeys("standard_user");
		Thread.sleep(500);

		//password
		WebElement name=driver.findElement(By.xpath("//input[@name=\"password\"]")); 
		name.sendKeys("secret_sauce");
		
		//Find unique class field by class name (login)
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@class=\"submit-button btn_action\"]")).sendKeys(Keys.ENTER); 
		//   //input[@class="submit-button btn_action"]

		//Close browser 
		//driver.close(); 
		
		} 
	
	}
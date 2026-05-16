package QABootcampMaven.axsosD7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.edge.EdgeDriver;

public class exampleForXPathUsingNameLocator {

	public static void main(String[] args) {

		//instantiation of driver 
		WebDriver driver = new EdgeDriver(); 
		//Launch website 
		driver.get("https://www.saucedemo.com/"); 
		//Find unique name field by name 
		//WebElement name=driver.findElement(By.name("password")); 
		WebElement name=driver.findElement(By.xpath("//input[@name=\"password\"]")); 
		name.sendKeys("Im unique Name and my XPath is //input[@name=\"password\"] ");
		//Close browser 
		//driver.close(); 
		
		} 
	
	}
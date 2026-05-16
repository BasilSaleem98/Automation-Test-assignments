package QABootcampMaven.axsosD7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.edge.EdgeDriver;

public class exampleForXPathUsingIDLocator {

	public static void main(String[] args) {

		//instantiation of driver 
		WebDriver driver = new EdgeDriver(); 
		//Launch website 
		driver.get("https://www.saucedemo.com/"); 
		//Find unique id field by id 
		WebElement id=driver.findElement(By.xpath("//input[@id=\"user-name\"]")); 
		id.sendKeys("Im unique ID and my XPath is //input[@id=\"user-name\"] ");
		//Close browser 
		//driver.close(); 
		
		} 
	
	}
package QABootcampMavenTNGD8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class verifyingWhetherAButtonIsEnabledOrDisabled {
	public WebDriver driver ; // Declare the WebDriver instance
	
	@Test
	public void buttonIsOnOff () throws InterruptedException {
		
		
		driver =new EdgeDriver();// Initialize the edge drive 
		driver.manage().window().maximize(); // Maximize the browser window 
		driver.get("https://the-internet.herokuapp.com/dynamic_controls"); // Navigate to the target URL 
		
		WebElement btnEnDis = driver.findElement(By.xpath("//button[text()='Enable']"));
		
		Thread.sleep(500);

			btnEnDis.click(); // enable it
			Thread.sleep(5500); //until the end of activation
			WebElement message = driver.findElement(By.xpath("//p[@id='message']"));

			if (btnEnDis.isEnabled()) 
				System.out.println("status of the button after step 2: " +  btnEnDis.isEnabled());
			
			Thread.sleep(500); //extra time to ensurness
			btnEnDis.click(); // disable it
			System.out.println("status of the button after step 5: " +btnEnDis.isEnabled());
	
	}

}

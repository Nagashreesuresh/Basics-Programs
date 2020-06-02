package Seleniumfirstclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementDisplay {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		boolean displayedFlag =driver.findElement(By.id("displayed-text")).isDisplayed();            // class for display HIDE and SHOW
		if(displayedFlag==true)
		{
			driver.findElement(By.id("displayed-text")).sendKeys("Test");
			
		}                                    
		
		else
		{
			System.out.println("This field is hidden");
			System.out.println("Enabling the hidden text box");
			driver.findElement(By.id("show-textbox")).click();
			driver.findElement(By.id("displayed-text")).sendKeys("After clicking on Demo");
		}
		
}


}
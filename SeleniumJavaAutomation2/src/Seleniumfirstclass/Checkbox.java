package Seleniumfirstclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox);
		
		
		/* CHECKING THE BOX   */
		
         for(int i=0; i<checkbox.size(); i++)
			
		{
			WebElement checkboxEle = checkbox.get(i);
			           checkboxEle.click();  
			
		}  
		Thread.sleep(2000);
		
		
	  /* UNCHECKING THE BOX   */ 
		 for(int i=0; i<checkbox.size(); i++)
				
			{
				WebElement checkboxEle = checkbox.get(i);
				           checkboxEle.click();  
				
			}
	         
			Thread.sleep(2000);      
            driver.close();
	}
	
	
}

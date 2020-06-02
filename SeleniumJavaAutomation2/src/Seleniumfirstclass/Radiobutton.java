package Seleniumfirstclass;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Radiobutton {
	
		
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radiobutton);
		
		for(int i=0; i<radiobutton.size(); i++)
			
		{
			
			radiobutton.get(i).click();  
				
			
			/* OR TRY THIS --- 	WebElement radiowebelement = radiobutton.get(i);
			radiowebelement.click();*/
			
		}
		Thread.sleep(2000);
		driver.close();
	}

}

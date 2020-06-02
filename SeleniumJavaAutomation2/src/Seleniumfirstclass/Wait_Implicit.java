
package Seleniumfirstclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wait_Implicit {
	
public static void main(String[] args) throws InterruptedException {                      
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // IMPLICITLY WAIT - 30 seconds and search for benzradio1 and execute next 
			
		driver.findElement(By.id("bmwradio")).click();
		
		try {
						driver.findElement(By.id("benzradio1")).click();
		}
		         catch(Exception e)
				
		{
			System.out.println(e);
		}
		driver.findElement(By.id("hondaradio")).click();
	}

}
/* 
Implicit Wait in Selenium :- 
SYNTAX:- driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

Explicit Wait in Selenium :- 
SYNTAX:-WebDriverWait wait = new WebDriverWait(driver,30);

Then try -catch for Explicit   */




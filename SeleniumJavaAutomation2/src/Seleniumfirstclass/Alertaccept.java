

package Seleniumfirstclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertaccept {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());                             // Alert Text will display in console
		alert.accept();                                                  // ALERT ACCEPT
		Thread.sleep(2000);
	    driver.close();
}

}



/* 
1. alert.sendKeys("My Program");      // ALERT SENDKEYS to enter
2. alert.dismiss();                  // ALERT DISMISS
3. alert.accept();                  // ALERT ACCEPT
4. alert.getText();                // Alert Text will display in console     */
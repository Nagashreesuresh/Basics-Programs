package Seleniumfirstclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_Display_particular_column {                          // Display WebElement
	
	
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		String tablecontent1 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(tablecontent1);

		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText());  // Direct output didn't assigned to web element

		Thread.sleep(2000);
		driver.close(); 
}



}
package Seleniumfirstclass;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MOuse_hover {
	
public static void main(String[] args) throws InterruptedException{                       // AWTException ->> For Robot robot = new Robot();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		
		Actions action = new Actions(driver);
	/* 	Robot robot = new Robot();                                 //{1}        Two Types 
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);*/
		
		//OR This 
		
		action.sendKeys(Keys.PAGE_DOWN).perform();                 //{2}  
		
		Thread.sleep(2000);

		WebElement mousehover = driver.findElement(By.id("mousehover"));
		Thread.sleep(2000);
		action.moveToElement(mousehover).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Top')]")).click();                    // CLICK ON "TOP"
		
		//	driver.findElement(By.xpath("//a[contains(text(),'Reload')]")).click();                     //CLICK ON "RELOAD"
		
}

}
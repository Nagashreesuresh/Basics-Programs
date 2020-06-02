package Seleniumfirstclass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframe {
	

public static void main(String[] args) throws InterruptedException {                      
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		/*//By Webelement                                                               TYPE - 1
		WebElement Iframe = driver.findElement(By.name("iframe-name"));
		driver.switchTo().frame("iframe-name"); */
		
		/*// By Frame name                                                               TYPE - 2
		driver.switchTo().frame("iframe-name");  */
		
		 
		//By Frame index                                                                 TYPE - 3
		driver.switchTo().frame(0);
		
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("search-courses")).sendKeys("JAVA Selenium");

}

}


















/*
How to identify frame:-
Right click on the iframe and check "view frame source is avaible"    or in code check for tag name:- <iframe>

3 Types of frames:- 

1. By Webelement
2. By Frame Name
3. By Frmae Index

*/
package Seleniumfirstclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver; */

import org.openqa.selenium.firefox.FirefoxDriver;

    public class seleniumfirstscreen {
	public static void main(String[] args) throws InterruptedException {
		
		
		//CHROME Driver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nichiuser\\chromedriver_win32\\chromedriver.exe"); 
		//WebDriver driver=new ChromeDriver();
		
		
		//Firefox Driver
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);   	
		driver.manage().window().maximize();
		
	 /* (THIS BY XPATH-TYPE)  */ 	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hr4712");   
		                            driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
	/* ( OR THIS BY XPATH-ID)	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("hr4712"); 
	                            driver.findElement(By.xpath("//div[@id='identifierNext']")).click();   */
		 
		Thread.sleep(2000);      
        driver.close();
		
		
		
/*	driver.get("https://www.facebook.com/");	
	          
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("harshith1234");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			
			
		//MS-Edge Driver	
		//System.setProperty("webdriver.edge.driver","C:\\Users\\nichiuser\\MSedgedriver_win64\\MicrosoftWebDriver.exe");
		//WebDriver driver=new EdgeDriver();
		//driver.get("http://www.facebook.com");
		
		//Thread.sleep(2000);
	   
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hr4712@gmail.com");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		Thread.sleep(2000);      
        driver.close();
		
		
		*/		
	
	}
}

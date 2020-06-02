package Seleniumfirstclass;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class OpenWindow {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		
		/* Dropdown  */
		WebElement dropdownEle = driver.findElement(By.id("carselect"));
		Select select = new Select(dropdownEle);                                             /*  IMPORTANT LINES FOR DROPDOWN */
		java.util.List<WebElement> dropdown = select.getOptions();                           /*  IMPORTANT LINES FOR DROPDOWN */
		
		
		for(int i=0; i<dropdown.size();i++)
			
		{
			dropdown.get(i).click();
			Thread.sleep(2000);
			
		}
			
		/*    OPENING NEW WINDOW    */
		driver.findElement(By.id("openwindow")).click();
	    String primaryWindow = driver.getWindowHandle();  //Primary Window
	    Set<String> multiWindow = driver.getWindowHandles();
	    System.out.println("MultiNumber"+multiWindow.size());
	    Iterator<String> itr = multiWindow.iterator();
	    while(itr.hasNext())                                                  // THIS IS IMPORTANT
	    {
	    	String secondaryWindow = itr.next();
	    	Thread.sleep(3000);
	    	if(!secondaryWindow.equals(primaryWindow))                         // No Semi-colon at the end.(Remember)
	    	{
	    		driver.switchTo().window(secondaryWindow);
	    		Thread.sleep(2000);
	    		driver.findElement(By.id("search-courses")).sendKeys("Complete Step By Step");
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("//i[@title='Search']")).click();
	    		
	    		Thread.sleep(2000);
	    		driver.close();
	    		
	    
	    
	    driver.switchTo().window(primaryWindow);        
	    Thread.sleep(2000);
		
	    
	    /* Radio Button  */
	    
	    List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radiobutton);
		
		for(int i=0; i<radiobutton.size(); i++)
			
		{
			radiobutton.get(i).click();  		
			
		}
		Thread.sleep(2000);
		driver.close();
	
	

	}
	    }
	    
	}
}
	    	
	    



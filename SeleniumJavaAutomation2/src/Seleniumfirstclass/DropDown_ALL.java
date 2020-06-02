package Seleniumfirstclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_ALL {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		WebElement dropdownEle = driver.findElement(By.id("carselect"));
		Select select = new Select(dropdownEle);                                   /*  IMPORTANT LINES FOR DROPDOWN */
		List<WebElement> dropdown = select.getOptions();                           /*  IMPORTANT LINES FOR DROPDOWN */
		System.out.println(dropdown.size());
		System.out.println(dropdown);
		
		for(int i=0; i<dropdown.size();i++)
			
		{
			dropdown.get(i).click();
			Thread.sleep(2000);
			
		}
		Thread.sleep(2000);
		driver.close();
	}
	}



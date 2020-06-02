	package Seleniumfirstclass;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Multiple_deselect_dropdown {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\nichiuser\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://learn.letskodeit.com/p/practice");
			driver.manage().window().maximize();
			
			WebElement dropdownmultiple = driver.findElement(By.id("multiple-select-example"));            /* Multiple select drop-down   */
			Select select1 = new Select(dropdownmultiple);                                          
			List<WebElement> multiple = select1.getOptions();                       
			
			
			for(int i=0; i<multiple.size();i++)
				
			{
				multiple.get(i).click();
				Thread.sleep(2000);
				
			}			
							
			select1.deselectAll();
			System.out.println("select by index");
            select1.selectByIndex(1);
            System.out.println("select by value");
            select1.selectByValue("peach");
			
			
			Thread.sleep(2000);
			driver.close();
		
		}

			
		}
	


	
	



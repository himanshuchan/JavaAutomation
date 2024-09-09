import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Auto_suggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		//in case of auto suggestive dropdown where dropdown comes according to our suggestion
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(1000);
		//List<WebElement> list = driver.findElements(By.cssSelector("Li[class='ui-menu-item'] a"));
		//System.out.println(driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a[@class='ui-corner-all']")));
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));//options will store selectors
		for (WebElement option : options)//In Java, you cannot directly print a list of WebElement objects to see their textual content because 
			//the WebElement class does not override the toString() method to return the element's text. 
			//When you print the list or its elements without iterating, you'll get the default toString() implementation, 
			//which usually includes the object's class name and hash code, not the human-readable text you expect.
		{	System.out.println(option.getText());
			/*if(option.getText().equalsIgnoreCase("India"))//
			{
				
				option.click();
				//break;
				
			}
			*/
			
		}
		

	}

}

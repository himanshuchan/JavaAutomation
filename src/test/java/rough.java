import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class rough {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Departure City']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//driver.findElement(By.cssSelector("//td[@data-handler='selectDay'] //a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		//ctl00_mainContent_ddl_destinationStation1_CTXT
		//ui-state-active
		// * driver.manage().window().maximize();
		// */
		/*driver.findElement(By.xpath("//input[contains(@value,'Departure City')]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//Handling dynamic dropdown using indexes
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'])")).click();//Handling dynamic dropdown without using indexes but by using parent child relationship xpath locator
	/*
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption1']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption1']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());//to know the size of a list
		*/
	}

}

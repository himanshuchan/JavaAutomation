import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//	WebDriver driver = new FirefoxDriver();
			//WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown=driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
	/*	WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select DropDown = new Select(staticdropdown); //for static dropdown
			driver.manage().window().maximize();// To maximize the window
			//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			DropDown.selectByIndex(2);
			System.out.println(DropDown.getFirstSelectedOption().getText());
			DropDown.selectByValue("USD");
			driver.findElement(By.id("divpaxinfo")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			/*int i=1;
			while(i<4)
			{
				driver.findElement(By.id("hrefIncAdt")).click();
				i++;
			}
			
			for(int j=1;j<4;j++)
			{
				driver.findElement(By.id("hrefIncAdt")).click();
			}
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			driver.findElement(By.id("btnclosepaxoption")).click();
		driver.close();*/

	}

}

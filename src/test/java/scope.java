import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//scope of the object to be minimized to a specific area of the webpage
		WebDriver driver = new ChromeDriver();//driver has scope of entire webpage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG"));//making a new object with lesser scope. Use findElement when creating a new object
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement colfooter = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(colfooter.findElements(By.tagName("a")).size());
		//Actions a = new Actions((WebDriver) colfooter);
		for (int i=1;i<colfooter.findElements(By.tagName("a")).size();i++)
		{	String keys = Keys.chord(Keys.CONTROL,Keys.ENTER);
			//a.moveToElement(colfooter.findElements(By.tagName("a")).get(i).click();
		colfooter.findElements(By.tagName("a")).get(i).sendKeys(keys);
		//Thread.sleep(1000);
		}
	}

}

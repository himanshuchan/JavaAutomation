import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class after_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//driver.get("https://courses.rahulshettyacademy.com/p/selenium-webdriver-interview-questions-tutorial");
		driver.get("https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/?couponCode=ST16MT230625G1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='more_lecture_sections']")).click();
		System.out.println(driver.findElements(By.className("section-title")));
		List<WebElement> sections = driver.findElements(By.className("section-title"));
		for (WebElement sec : sections)
		{
			System.out.println(sec.getText());
		}
	//	driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("macbook pro m4");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Actions actions = new Actions(driver);
		//actions.sendKeys(Keys.PAGE_DOWN).build().perform(); // Scrolls down
	/*	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".section--section-title")));

		// Collect all section elements
		List<WebElement> sections = driver.findElements(By.cssSelector(".section--section-title"));
		for (WebElement sec : sections) {
		    System.out.println(sec.getText());*/
	}

}

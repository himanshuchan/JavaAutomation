import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // URL in the browser
		driver.findElement(By.id("name")).sendKeys("Himanshu");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();

	}

}

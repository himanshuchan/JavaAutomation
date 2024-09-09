import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();// To maximize the window
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		//driver.navigate().to("https://google.com/");
		/*driver.findElement(By.className("forgot-pwd-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		*/
		//driver.close();
	}

}

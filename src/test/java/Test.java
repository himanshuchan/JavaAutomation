import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pinelabs.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Build With Us']")).click();
		

	}

}

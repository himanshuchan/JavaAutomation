import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		//
		System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());

	}

}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		int rowsize=driver.findElements(By.xpath("//table[@id='countries'] //tr")).size();
		int colsize=driver.findElements(By.tagName("td")).size();
		System.out.println(rowsize);
		System.out.println(colsize);
	}

}

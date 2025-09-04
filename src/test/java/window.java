import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/in/himanshu-baunthiyal-93532636/");
		driver.manage().window().fullscreen();
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
	}

}

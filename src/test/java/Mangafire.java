import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Mangafire {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mangafire.to/");

	}

}

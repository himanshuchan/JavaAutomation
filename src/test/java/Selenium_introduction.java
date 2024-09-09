import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello Himanshu");
//ChromeDriver driver = new ChromeDriver();
//https://www.youtube.com/
	System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Games\\chromedriver-win64\\ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	//System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft\\edgedriver_win64\\msedgedriver.exe");
	//WebDriver driver = new EdgeDriver();
	driver.get("https://youngsoul.in/");
	//System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getTitle());
	//driver.close();
	//driver.quit();
	}
}

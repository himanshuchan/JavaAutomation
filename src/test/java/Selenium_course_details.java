import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium_course_details {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * //options.addArguments("--headless=new"); // new headless mode in newer
		 * Chrome versions options.
		 * addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/114.0.0.0 Safari/537.36"
		 * );
		 */

		/**
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.udemy.com/join/passwordless-auth/?locale=en_US&next=https%3A%2F%2Fwww.udemy.com%2Flogout%2F&response_type=html&action=login&mode");
		 * driver.findElement(By.className("ud-text-input-medium")).sendKeys("himas.himanshu@gmail.com");
		 * Thread.sleep(5000);
		 * //System.out.println(driver.findElement(By.className("section--section-title--svpHP")).getText());
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		/*driver.findElement(By.id("inputUsername")).sendKeys("Himanshu");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//Button[text()='Log Out']")).click();*/
	//	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//Assert.assertEquals(driver.findElement(By.cssSelector("p.error")).getText(), "* Incorrect username or passwor");
		//System.out.println();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String str=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		System.out.println(str);
		String str1[]=str.split("'");
		int count=0;
		for (String st:str1)
		{
			System.out.println(st);
		count++;
		System.out.println(count);
		
		}
		

	}

}

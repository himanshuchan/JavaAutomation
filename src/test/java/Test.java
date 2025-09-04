import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String str=driver.findElement(By.className("infoMsg")).getText();
		System.out.println(str);
		String str1[]=str.split("'");
		for(int i=0;i<=str.length();i++)
		{
			System.out.println(str1[i]);
		}

	}

}

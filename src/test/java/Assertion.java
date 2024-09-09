import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	Thread.sleep(1000);
	for(int i=0;i<3;i++)
	{
	driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	}
	//String s =driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText();
	Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(),"5 Adult");
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.getTitle();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Himanshu Baunthiyal");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("himas.himanshu");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Passwd");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		WebElement w = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")); 
		Select dropdown = new Select(w);
		dropdown.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("24-11-1995");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String date="06";
		String month="12";
		String year="2014";
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text='"+year+"']")).click();
//		driver.findElement(By.xpath("//input[@name='month']")).sendKeys("12");
//		driver.findElement(By.xpath("//input[@name='day']")).sendKeys(date);
//		driver.findElement(By.xpath("//input[@name='year']")).sendKeys("2024");
//		String wb= driver.findElement(By.xpath("//input[@name='date']")).getText();
//		System.out.println(wb);
//		

	}

}

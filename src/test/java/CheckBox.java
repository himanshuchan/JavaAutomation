import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());//to check if checkbox is selected. As checkbox is not seleccted yet it will give false
	driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());//will return true as checkbox is now selected
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}

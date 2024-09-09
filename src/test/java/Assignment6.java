import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		//String str= driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).getText();//The getText() method is used to retrieve the visible (i.e., not hidden by CSS) inner text of an element.
		//Use getText() for elements that have visible text content, such as <div>, <span>, etc.
		//For form elements like checkboxes, use getAttribute() or isSelected() depending on what information you want to retrieve.
		String str= driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).getAttribute("value");
		System.out.println(str);
		WebElement element = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select Dropdown = new Select(element);
		Dropdown.selectByValue(str);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(str);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String str1=driver.switchTo().alert().getText();
		System.out.println(str1.contains(str));
		if(str1.contains(str))
		{
			System.out.println("Verified: "+str+"is present in "+str1);
		}

	}

}

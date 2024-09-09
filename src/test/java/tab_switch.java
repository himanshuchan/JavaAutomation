import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.Iterator;

public class tab_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		//driver.get
		Set<String> windows= driver.getWindowHandles();
	    Iterator<String> it=windows.iterator();
	    String parentid= it.next();
	    String childid=it.next();
	    driver.switchTo().window(childid);
	    System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	    String email= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	    driver.switchTo().window(parentid);
	    driver.findElement(By.id("username")).sendKeys(email);
	    
	}

}

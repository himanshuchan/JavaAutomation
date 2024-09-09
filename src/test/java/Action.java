import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 How to use mouseover on object with selenium?
		 Performing mouse and keyboard interaction with selenium
		 Context click on element
		 Double click on element
		 Drag and drop the element		 
		 */
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);//
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();//to mouseover on object in selenium
		//a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();//context click is same as right click
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("Hello").doubleClick().build().perform();//double click in action class
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("HeLlo").build().perform();//irrespective of the text it will always print capital letters
	
	//	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//driver.findElement(By.className("blinkingText")).click();
	}

}

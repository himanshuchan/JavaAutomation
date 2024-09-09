import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Frames are used to split the webpage horizontally or vertically. So with the help of frame we can split a webpage into 
		//multiple sections
		//iframe is used to display a webpage within a webpage
		//Frames can be identified using id,index and its webelement
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());//there is only one frame in the page
		driver.switchTo().frame(0);//as there is only one frame switching to 0th index
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));//switching to the frame
		//driver.findElement(By.xpath("//div[@id='draggable']")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();//switches back to the default window

	}

}

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_tab_titles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement subdriver =driver.findElement(By.xpath("//div[@id='gf-BIG'] //td[1]"));
		
		for (int i=1;i<subdriver.findElements(By.tagName("a")).size();i++)
		{
			String clickontabs = Keys.chord(Keys.CONTROL,Keys.ENTER); // control+enter ya click krke naya tab khulta hai
			subdriver.findElements(By.tagName("a")).get(i).sendKeys(clickontabs);//background mein naya tab kholne k liye
			
		}//opens all tabs
		Set<String> abc= driver.getWindowHandles();
		Iterator<String> it=abc.iterator(); 
		while(it.hasNext())//hasNext checks whether next index is present or not
			{
			//it.next();//prints window id	
			driver.switchTo().window(it.next());//it.next() it actually moves to next index
			System.out.println(driver.getTitle());
			}
			
		
	}

}

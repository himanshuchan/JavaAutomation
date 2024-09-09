import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{//<input type="submit" name="commit" value="Log in" class="btn-primary button p-v-2-xs p-h-5-xs m-v-3-xs col-12-xs" data-testid="login-button" data-disable-with="Log in">
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//to delay the selenium so that selenium can get the error text 
		//selenium will wait on every step with the given time for the text to show up
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		/*driver.findElement(By.id("inputUsername")).sendKeys("himanshu.sdet@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("sdettesting");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//As error will come after sometime. It might happen that selenium tries to immediately get the text before it pops up. for that we have to implicit delay the selenium 
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("himanshu");
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("himanshu.sdet@gmail.com");
		//driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("himanshu.sdet@gmail.com");//indexing using x-path,when there are multiple lines with same attributes.
		driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("himas.himanshu");//indexing using css selector
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456789");
		driver.findElement(By.className("reset-pwd-btn")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();//to clear the field  
	    //driver.findElement(By.xpath("//*[@placeholder='Name']")).clear();--in xpath only--* can be replaced with any tagname
		//driver.findElement(By.className("go-to-login-btn")).click();
		//driver.findElement(By.className("ghost")).click();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("Testing");
		//driver.findElement(By.xpath)
		//driver.close();
		//System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		*/
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Himanshu");
		//driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("Testing");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.className("logout-btn")).click();
		//Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")));
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		driver.findElement(By.className("logout-btn")).click();
		driver.close();
		
		

	}

}

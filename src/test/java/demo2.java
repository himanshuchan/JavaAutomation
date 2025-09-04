import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class demo2 {
    public static void main(String[] args) {
        // Set up WebDriver
      
        WebDriver driver = new ChromeDriver();
        String name ="Himanshu";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();
        String str = driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();
        System.out.println(str);
        Assert.assertEquals(str,"You are successfully logged in.");
        String text=driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"Hello "+name+",");
        
        
        
    }
}
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSiblingExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Load the local HTML file
        File file = new File("C:\\Users\\himas\\OneDrive\\Desktop\\sample.html");
        String filePath = "file:///" + file.getAbsolutePath();
        driver.get(filePath);

        // Using following-sibling to locate Email input field
        WebElement emailInput = driver.findElement(
            By.xpath("//label[text()='Email']/following-sibling::input")
        );
        emailInput.sendKeys("test@example.com");

        // Using following-sibling to locate Password input field
        WebElement passwordInput = driver.findElement(
            By.xpath("//label[text()='Password']/following-sibling::input")
        );
        passwordInput.sendKeys("secret123");

        Thread.sleep(3000); // Just to visually see input, not needed in real code
        driver.quit();
    }
}

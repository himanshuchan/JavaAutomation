import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String[] items = {"Cucumber","Brocolli"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i =0;i<product.size();i++)
		{	String[] name=product.get(i).getText().split("-");
			String formattedstring = name[0].trim();
			//System.out.println(product.get(i).getText());
			List itemsneeded = Arrays.asList(items);
			if(itemsneeded.contains(formattedstring))
			{
				
				//System.out.println(s);
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
				
		}
		

	}

}

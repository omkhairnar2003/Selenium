package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonClothes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://www.amazon.in/");
	     
	     driver.findElement(By.className("a-button-text")).click();
	     
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Winter clothes for men");
	     driver.findElement(By.id("nav-search-submit-button")).click();
	     
	     List<WebElement> products = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));

	         int count = 1;

	         for (WebElement product : products) {
	             try {
	            	 String name = product.findElement(By.xpath(".//h2//span")).getText();
	            	 
	            	 String price = product.findElement(By.xpath(".//span[@class='a-price']")).getText();

	                 System.out.println(count++ + ". " + name);
	                 System.out.println("   Price: ₹" + price);
	                 System.out.println("----------------------------------");

	             } catch (Exception e) {
	             
	             }
	         }
 
		 Thread.sleep(2000);
		 driver.quit();
	}
}
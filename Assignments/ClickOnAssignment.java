package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAssignment {

		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			
			WebElement login=driver.findElement(By.className("ico-login"));
			login.click();
			Thread.sleep(2000);
			
			WebElement cart=driver.findElement(By.className("ico-cart"));
			cart.click();
			Thread.sleep(2000);
			
			WebElement wishlist=driver.findElement(By.className("ico-wishlist"));
			wishlist.click();
			Thread.sleep(2000);
			
			driver.close();
		}
	}
	// another name for locator is selector
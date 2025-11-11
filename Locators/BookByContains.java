package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//// Xpath By contains function
public class BookByContains {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Using text
//		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
//		Thread.sleep(3000);
		
		//using attribute
		driver.findElement(By.xpath("//input[contains(@class,'search-box-text')]")).sendKeys("Heater");
		Thread.sleep(3000);
		
		driver.close();
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByText {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		
		//LinkText
//		driver.findElement(By.linkText("Log in")).click();
//		Thread.sleep(3000);
		
		//Partial LinkText
		driver.findElement(By.partialLinkText("Shopping")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}

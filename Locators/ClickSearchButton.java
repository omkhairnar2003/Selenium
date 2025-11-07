package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickSearchButton {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		
//		driver.findElement(By.id("small-searchterms")).sendKeys("Sleeping pillow");
//		driver.findElement(By.cssSelector("input[value='Search']")).click();
//		Thread.sleep(3000);
		
		//Shortcut for attributes
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Blanket");
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		Thread.sleep(3000);
		
	    driver.close();	
	}
}
//class Attribute -> .
//id Attribute -> #
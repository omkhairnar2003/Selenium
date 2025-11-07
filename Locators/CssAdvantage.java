package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAdvantage {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
//		driver.findElement(By.cssSelector(".poll-options>li>input")).click();
//		Thread.sleep(2000);
		
		// CSS travesing
		driver.findElement(By.cssSelector(".poll-options>li:nth-child(1)>input")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
// write a script for demowebshop
//open the browser
//maximize
//enter dws home
//click login
//perform login
//close the browser

//open the browser
//maxmize the browser
// enter dws
// click excellent good poor very bad radiobutton by using css travesing
//close the browser
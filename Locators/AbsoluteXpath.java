package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a")).click();
		Thread.sleep(1000);
		
		driver.close();
		
		
	}

}
//Absolute Xpath
// "/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a" ->To use in html dom search
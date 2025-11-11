package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComputerShopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input)[12]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='product_attribute_72_5_18_65']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='product_attribute_72_6_19_91']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='product_attribute_72_3_20_58']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_94']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='addtocart_72_EnteredQuantity']")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='addtocart_72_EnteredQuantity']")).sendKeys("2");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//span)[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}

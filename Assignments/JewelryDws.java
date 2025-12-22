package Assignments;

import org.openqa.selenium.By;
import UtilityClass.BaseClass;

public class JewelryDws extends BaseClass{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		preCondition();

		driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Your Own Jewelry')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//option[contains(text(),'Silver (1 mm)')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("10");
		Thread.sleep(1000);
		
		driver.findElement(By.id("product_attribute_71_11_17_49")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("addtocart_71_EnteredQuantity")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("addtocart_71_EnteredQuantity")).sendKeys("2");
		Thread.sleep(1000);
		
		driver.findElement(By.id("add-to-cart-button-71")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		Thread.sleep(1000);
		
		String expectedProduct = "Create Your Own Jewelry";

		String actualProduct = driver.findElement(By.xpath("//a[@class='product-name']")).getText();

		if(actualProduct.equals(expectedProduct)) 
		{
		    System.out.println("Product successfully added to cart!");
		    System.out.println("Test case is passed");
		} 
		else 
		{
		    System.out.println("Product not added!");
		    driver.close();
			throw new Exception("Testcase is failed");
		}
		postCondition();
	}
}
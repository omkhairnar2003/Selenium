package Assignments;

import org.openqa.selenium.By;

import utilityClass.BaseClass;

public class Laptop14Inch extends BaseClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		precondition();
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input)[11]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("removefromcart")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("updatecart")).click();
		Thread.sleep(3000);
		
		String expectedProduct = "Your Shopping Cart is empty!";
		
		String actualProduct = driver.findElement(By.xpath("//div[@class='order-summary-content']")).getText();
		
		if(actualProduct.equals(expectedProduct)) 
		{
		    System.out.println("Product successfully removed from cart!");
		    System.out.println("Test case is passed");
		} 
		else 
		{
		    System.out.println("Product not removed!");
		    logout();
		    postCondition();
			throw new Exception("Testcase is failed");
		}
		logout();
		postCondition();
	}
}
package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilityClass.BaseClass;

public class ShoppingLink extends BaseClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		precondition();
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		
		WebElement shop = driver.findElement(By.className("cart-label"));
		if(shop.isEnabled())
		{
			System.out.println("Shopping Cart element is enabled and TestCase is passed");
			shop.click();
		}
		else 
		{
			logout();
			postCondition();
			throw new Exception("Shopping cart element is not enabled and TestCase is failed");
		}
		logout();
		postCondition();
	}
}
package DwsTestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UtilityClass.BaseClass2;

public class GiftCard extends BaseClass2 {
	
	@Test
	public void Product() throws Exception {
		// TODO Auto-generated method stub
     	preCondition();
     	
        String expected_url="https://demowebshop.tricentis.com/";
		
		driver.get(expected_url);
		String actual_url=driver.getCurrentUrl();
		if(expected_url.equals(actual_url))
		{
			System.out.println("i am in targeted webpage");
		}
		else
		{
			System.out.println("i am not in targeted webpage");
			postCondition();
			throw new Exception("Testcase is failed");
		}
		
		login();	
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Rahul");
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("Rahul@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_SenderName"));
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_SenderEmail"));
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Sending you a small gift card");
		Thread.sleep(1000);
		
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		Thread.sleep(1000);
		
		String expectedProduct = "$25 Virtual Gift Card";

		String actualProduct = driver.findElement(By.xpath("//a[@class='product-name']")).getText();

		if(actualProduct.equals(expectedProduct)) 
		{
		    System.out.println("Product successfully added to cart!");
		    System.out.println("Test case is passed");
		} 
		else 
		{
		    System.out.println("Product not added!");
		    postCondition();
			throw new Exception("Testcase is failed");
		}
		
	    logout();
	    postCondition();
	}
}
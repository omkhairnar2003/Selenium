package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import UtilityClass.BaseClass;

public class BookCheck extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition();
		
		login();
		
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		
		List<WebElement> add = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement web:add)
		{
			web.click();
			Thread.sleep(2000);	
		}
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		Thread.sleep(1000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='cart']//tbody/tr"));

		double highestPrice = 0.0;
		WebElement highestPriceCheckbox = null;
		String removedProductName = null;

		for (WebElement row : rows) 
		{
		    WebElement priceSpan = row.findElement(By.xpath(".//span[@class='product-unit-price']"));
		    String priceText = priceSpan.getText();
		    double price = Double.parseDouble(priceText);

		    if (price > highestPrice) 
		    {
		        highestPrice = price;
		        highestPriceCheckbox = row.findElement(By.xpath(".//input[@name='removefromcart']"));
		        removedProductName = row.findElement(By.xpath(".//a[@class='product-name']")).getText();
		    }
		}
		
		highestPriceCheckbox.click();
		
		driver.findElement(By.name("updatecart")).click();
		Thread.sleep(1000);

		List<WebElement> productNames =driver.findElements(By.xpath("//a[@class='product-name']"));

		boolean isRemoved = true;

		for (WebElement product : productNames) 
		{
		    if (product.getText().equalsIgnoreCase(removedProductName)) 
		    {
		        isRemoved = false;
		        break;
		    }
		}

		if (isRemoved)
		    System.out.println("Product successfully removed: " + removedProductName);
		else
		    System.out.println("Product NOT removed: " + removedProductName);
		
		logout();
		postCondition();
	}
}
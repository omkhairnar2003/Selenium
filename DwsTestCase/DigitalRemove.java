package DwsTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import UtilityClass.BaseClass2;

public class DigitalRemove extends BaseClass2{
	
	@Test
	public void digital() throws Exception {
		
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
		
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		List<WebElement> add = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement web:add)
		{
			web.click();
		    Thread.sleep(2000);
		}
		
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		Thread.sleep(1000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='cart']//tbody/tr"));
		
		List<WebElement> beforeRows =driver.findElements(By.xpath("//table[@class='cart']//tbody/tr"));
		int beforeCount = beforeRows.size();

		double highestPrice = 0.0;
		WebElement highestPriceCheckbox = null;

		for (WebElement row : rows) 
		{
		    WebElement priceSpan = row.findElement(By.xpath(".//span[@class='product-unit-price']"));
		    String priceText = priceSpan.getText();
		    double price = Double.parseDouble(priceText);

		    if (price > highestPrice) 
		    {
		        highestPrice = price;
		        highestPriceCheckbox = row.findElement(By.xpath(".//input[@name='removefromcart']"));
		    }
		}
		
		highestPriceCheckbox.click();

		driver.findElement(By.name("updatecart")).click();
		
		Thread.sleep(1000); 

		List<WebElement> afterRows =driver.findElements(By.xpath("//table[@class='cart']//tbody/tr"));
		int afterCount = afterRows.size();

		if (afterCount == beforeCount - 1) 
		{
		    System.out.println("Product removed successfully");
		} 
		else 
		{
			postCondition();
			throw new Exception("Product removal failed");
		}
		logout();
		postCondition();
	}
}
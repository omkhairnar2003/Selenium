package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApparelShoes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.className("ico-login"));
		login.click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("Email")).sendKeys("omkhairnar@gmail.com");
		Thread.sleep(1000);   
		
		driver.findElement(By.cssSelector("#Password")).sendKeys("omkhairnar");
		Thread.sleep(1000); 
		
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		
		List<WebElement> add = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement web:add)
		{
			web.click();
			Thread.sleep(2000);
			
			List<WebElement> size = driver.findElements(By.id("product_attribute_5_7_1"));
			if(size.size() > 0) 
			{
			    size.get(0).sendKeys("2X");
			}
			Thread.sleep(1000);
			
			List<WebElement> size2 = driver.findElements(By.id("product_attribute_28_7_10"));
			if(size2.size() > 0) 
			{
			    size2.get(0).sendKeys("10");
			}
			Thread.sleep(1000);
			
			List<WebElement> color = driver.findElements(By.className("color"));
			if(color.size() > 0) 
			{
			    color.get(0).click();
			}
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			Thread.sleep(2000);
			driver.navigate().back();		
		}
		
		driver.findElement(By.className("close")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		Thread.sleep(1000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='cart']//tbody/tr"));

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
		
		Thread.sleep(2000);
		driver.close();
	}

}
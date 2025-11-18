package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductAdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
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

		double highestPrice = 0.0;
		WebElement highestPriceCheckbox = null;

		for (WebElement row : rows) 
		{
		    WebElement priceSpan = row.findElement(By.xpath(".//span[@class='product-unit-price']"));
		    String priceText = priceSpan.getText().replace("$", "").trim();
		    double price = Double.parseDouble(priceText);

		    if (price > highestPrice) 
		    {
		        highestPrice = price;
		        highestPriceCheckbox = row.findElement(By.xpath(".//input[@name='removefromcart']"));
		    }
		}
		highestPriceCheckbox.click();

		driver.findElement(By.name("updatecart")).click();

		Thread.sleep(3000);
		driver.close();
	}

}
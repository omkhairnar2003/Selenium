package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DigitalDropDown {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		
		WebElement singleSelect=driver.findElement(By.id("products-orderby"));
		Select sel=new Select(singleSelect);
		
		List<WebElement> options = sel.getOptions();
		int i=0;
		for(WebElement web: options) 
		{
			singleSelect=driver.findElement(By.id("products-orderby"));
			sel=new Select(singleSelect);
			sel.selectByIndex(i++);
			Thread.sleep(2000);
		}
		
		WebElement display=driver.findElement(By.id("products-pagesize"));
		Select select2=new Select(display);
		
		List<WebElement> options2 = select2.getOptions();
		int j=0;
		for(WebElement web: options2) 
		{
			display=driver.findElement(By.id("products-pagesize"));
			select2=new Select(display);
			select2.selectByIndex(j++);
			Thread.sleep(2000);
		}
		
		WebElement view=driver.findElement(By.id("products-viewmode"));
		Select select3=new Select(view);
		
		List<WebElement> options3 = select3.getOptions();
		int k=0;
		for(WebElement web: options3) 
		{
			singleSelect=driver.findElement(By.id("products-viewmode"));
			select3=new Select(view);
			select3.selectByIndex(k++);
			Thread.sleep(2000);
		}
				
		Thread.sleep(2000);
		driver.close();
	}

}
package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspPopUp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//section[contains(text(),'Browser Windows')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
	    
	    String parent = driver.getWindowHandle();
	    
	    driver.switchTo().window(parent);
	    driver.close();

	    
	    Set<String> childs= driver.getWindowHandles();
		for(String str: childs)
		{
			driver.switchTo().window(str);

	    	if (str.equals(parent)) 
	    	{
	    		continue;
	    	}

	    	Thread.sleep(1500);

	    	String productName = driver.findElement(By.xpath("//h1")).getText();

	    	String productPrice = driver.findElement(By.xpath("//p[contains(text(),'$')]")).getText();

	    	System.out.println("Product: " + productName);
	    	
	    	System.out.println("Price: " + productPrice);
	    	
	    	System.out.println("---------------------------");
		}
	}
}
package DwsTestCase;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import UtilityClass.BaseClass2;

public class FbTwitter extends BaseClass2 {
	
	@Test
	public void dws() throws Exception {
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
			
			Actions act = new Actions(driver);
			WebElement followUs = driver.findElement(By.xpath("//a[text()='nopCommerce']"));
			act.scrollToElement(followUs).perform();
			List<WebElement> follow = driver.findElements(By.xpath("//a[@target='_blank']"));
			for (WebElement web : follow) 
			{
				act.keyDown(Keys.CONTROL).click(web).perform();
				Thread.sleep(2000);
			}
			String dwsWindow = driver.getWindowHandle(); 
			Set<String> child = driver.getWindowHandles();
	
			for (String str : child) 
			{
				driver.switchTo().window(str);
				 String url = driver.getCurrentUrl();
				
				if (url.contains("facebook.com"))
				{
					driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test123@gmail.com");
					driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
			
	                System.out.println("Facebook credentials entered.");
				}
				else if (url.contains("x.com")) {
	                	
	                    Thread.sleep(3000);
	                    driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
	                    Thread.sleep(3000);

	                    driver.findElement(By.xpath("//input[@autocomplete='name']")).sendKeys("OM");
	                    Thread.sleep(1000);
	                    driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys("om@gmail.com");
	                    Thread.sleep(1000);
	                    driver.findElement(By.id("SELECTOR_1")).sendKeys("May");
	                    Thread.sleep(1000);
	                    driver.findElement(By.id("SELECTOR_2")).sendKeys("20");
	                    Thread.sleep(1000);
	                    driver.findElement(By.id("SELECTOR_3")).sendKeys("2003");
	                    Thread.sleep(1000);
	                    
	                    System.out.println("Twitter account form filled.");
	                } 
			}
			  for (String window : driver.getWindowHandles()) {
		            if (!window.equals(dwsWindow)) {
		                driver.switchTo().window(window);
		                driver.close();
		            }
		        }
			  
			 driver.switchTo().window(dwsWindow);
			 System.out.println("All child browsers closed. Back to Demo Web Shop.");

			logout();
}
}
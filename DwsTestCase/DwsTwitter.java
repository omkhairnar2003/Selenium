package DwsTestCase;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import UtilityClass.BaseClass2;

	public class DwsTwitter extends BaseClass2{
		
		@Test
	    public void twitter() throws Exception {

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

	         
	        List<WebElement> followLinks = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));

	        Actions act = new Actions(driver);

	        
	        for (WebElement ele : followLinks) {
	            act.keyDown(Keys.CONTROL).click(ele).keyUp(Keys.CONTROL).perform();
	            Thread.sleep(700);
	        }

	        Set<String> allWindows = driver.getWindowHandles();
	        String dwsWindow = driver.getWindowHandle(); 

	        for (String win : allWindows) {

	            driver.switchTo().window(win);
	            String url = driver.getCurrentUrl();
	            
	             if (url.contains("x.com")) {
	                	
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
	        driver.switchTo().window(dwsWindow);
	        System.out.println("Returned to Demo Web Shop.");

	        logout();
	        driver.close();
	    }
	}
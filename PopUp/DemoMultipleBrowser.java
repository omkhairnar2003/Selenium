package PopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMultipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String twitter ="https://x.com/nopCommerce";
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    driver.get("https://demowebshop.tricentis.com/");
		
		Actions act=new Actions(driver);
		
		WebElement selenium = driver.findElement(By.className("footer-disclaimer"));
     
        act.scrollToElement(selenium).perform();
		
		List<WebElement> tabs = driver.findElements(By.xpath("//a[@target='_blank']"));
		
		for(WebElement web: tabs)
		{
			act.keyDown(Keys.CONTROL).click(web).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		
		Set<String> childs= driver.getWindowHandles();
		System.out.println(childs);
		for(String str: childs)
		{
			driver.switchTo().window(str);
			String actual_url=driver.getCurrentUrl();
			if(twitter.equals(actual_url))
			{
				driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
				Thread.sleep(2000);
			}
		}
				Set<String> all= driver.getWindowHandles();
				
				for(String stri: all)
				{
					driver.switchTo().window(stri);
					String actua_url=driver.getCurrentUrl();
					String signIn="https://x.com/i/flow/signup";
					if(signIn.equals(actua_url))
					{	
						Thread.sleep(2000);
						driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
						Thread.sleep(2000);
						
						//WebElement nameField = driver.findElement(By.xpath("//input[@name='name']"));
						//act.click(nameField).sendKeys("OM").perform();
						act.sendKeys("om").perform();
				      //  act.sendKeys(nameField, "OM").perform();
						
					   // driver.findElement(By.xpath("//input[@name='name']")).sendKeys("OM");    
					}
				}
			}
		}
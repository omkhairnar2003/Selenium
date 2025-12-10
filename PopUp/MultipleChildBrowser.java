package PopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultipleChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String homeAndKitchen="https://www.ajio.com/c/8312";
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		List<WebElement> products = driver.findElements(By.id("menu-item-seperator"));
		Actions act=new Actions(driver);
		
		for(WebElement web: products)
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
			if(homeAndKitchen.equals(actual_url))
			{
				WebElement sortBy=driver.findElement(By.id("sortBy"));
				Select sel=new Select(sortBy);
				List<WebElement> options=sel.getOptions();
				int i=0;
				for(WebElement web:options)
				{
					sel.selectByIndex(i++);
					Thread.sleep(1000);
				}
			}
			Thread.sleep(2000);
		}
	}

}

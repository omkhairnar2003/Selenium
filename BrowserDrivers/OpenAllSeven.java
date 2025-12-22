package BrowserDrivers;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class OpenAllSeven extends UtilityClass.BaseClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		preCondition();
		login();
		Actions actions=new Actions(driver);
		List<WebElement> links=driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		for(WebElement web:links) {
			actions.keyDown(Keys.CONTROL).click(web).perform();
			Thread.sleep(2000);
		}
		Set<String> windows=driver.getWindowHandles();
		int childBrowsers=windows.size()-1;
		
		if(childBrowsers==7) 
		{
			System.out.println("all 7 child browsers are opened successfully and testcase is pass");
		}
		else {
			driver.quit();
			throw new Exception("browser windows not opened properly and testcase is fail");
			
		}
		logout();
		postCondition();

	}
}
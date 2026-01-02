package DwsTestCase;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import UtilityClass.BaseClass2;

public class DigitalDropDown extends BaseClass2 {
	
	@Test
	public void dropDown() throws Exception {
	
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

	        Select orderBy = new Select(driver.findElement(By.id("products-orderby")));
	        List<String> orderByTexts = new ArrayList<>();

	        for (WebElement option : orderBy.getOptions()) {
	            String text = option.getText();
	            orderByTexts.add(text);
	            System.out.println("Order By option: " + text);
	        }

	        for (String text : orderByTexts) {
	            orderBy = new Select(driver.findElement(By.id("products-orderby")));
	            orderBy.selectByVisibleText(text);
	            Thread.sleep(2000);
	        }

	        Select pageSize = new Select(driver.findElement(By.id("products-pagesize")));
	        List<String> pageSizeTexts = new ArrayList<>();

	        for (WebElement option : pageSize.getOptions()) {
	            String text = option.getText();
	            pageSizeTexts.add(text);
	            System.out.println("Page Size option: " + text);
	        }

	        for (String text : pageSizeTexts) {
	            pageSize = new Select(driver.findElement(By.id("products-pagesize")));
	            pageSize.selectByVisibleText(text);
	            Thread.sleep(2000);
	        }

	        Select viewMode = new Select(driver.findElement(By.id("products-viewmode")));
	        List<String> viewModeTexts = new ArrayList<>();

	        for (WebElement option : viewMode.getOptions()) {
	            String text = option.getText();
	            viewModeTexts.add(text);
	            System.out.println("View Mode option: " + text);
	        }

	        for (String text : viewModeTexts) {
	            viewMode = new Select(driver.findElement(By.id("products-viewmode")));
	            viewMode.selectByVisibleText(text);
	            Thread.sleep(2000);
	        }

	        logout();
	        postCondition();
}
}
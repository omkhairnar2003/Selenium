package utilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_001 extends BaseClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String expected_data="Mobile";
		precondition();
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		WebElement searchfield = driver.findElement(By.id("small-searchterms"));
		searchfield.sendKeys(expected_data);
		Thread.sleep(1000);
		String actual_data=searchfield.getAttribute("value");
		if(expected_data.equals(actual_data))
		{
			System.out.println("Data is same and TestCase Pass");
		}
		else
		{
			logout();
			postCondition();
			throw new Exception("Data is not same and TestCase Fail");
		}
		logout();
		postCondition();
	}

}

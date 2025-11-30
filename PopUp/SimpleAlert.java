package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class SimpleAlert extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		precondition();
		
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(1000);
		driver.close();
	}
}
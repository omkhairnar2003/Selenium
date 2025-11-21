package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEmail {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String expected_title="Demo Web Shop. Login";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-login")).click();
		
		String actual_title=driver.getTitle();
		if(expected_title.equals(actual_title))
		{
			System.out.println("Successfully entered into login page");
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("did not enter into targeted page");
			driver.close();
			throw new Exception("Test case failed");
		}
		
		String expected_data="omkhairnar@gmail.com";
		
		WebElement emailfield = driver.findElement(By.xpath("//input[@class='email']"));
		emailfield.sendKeys(expected_data);
		String actual_data = emailfield.getAttribute("value");
		System.out.println("Emailfield data is :"+actual_data);
		if(expected_data.equals(actual_data))
		{
			System.out.println("data is same and TestCase pass");
		}
		else
		{
			driver.close();
			throw new Exception("data is not same and TestCase fail");
		}
		
		driver.close();
	}

}

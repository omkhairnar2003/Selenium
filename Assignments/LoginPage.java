package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

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
		driver.close();
	}

}

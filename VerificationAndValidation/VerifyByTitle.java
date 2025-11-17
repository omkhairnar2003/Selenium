package VerificationAndValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String expected_title="Demo Web Shop";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		String actual_title=driver.getTitle();
		if(expected_title.equals(actual_title))
		{
			System.out.println("Targeted title fetched");
			driver.findElement(By.xpath("//a[@class='ico-register']")).click();
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Targeted title didnt fetched");
			driver.close();
			throw new Exception("Test case failed");
		}
		Thread.sleep(3000);
		driver.close();
	}

}

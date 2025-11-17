package VerificationAndValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByURL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String expected_url="https://demowebshop.tricentis.com";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.get(expected_url);
		String actual_url=driver.getCurrentUrl();
		if(expected_url.equals(actual_url))
		{
			System.out.println("i am in targeted webpage");
			driver.findElement(By.xpath("//a[@class='ico-register']")).click();
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("i am not in targeted webpage");
			driver.close();
			throw new Exception("Testcase is failed");
		}
		Thread.sleep(4000);
		driver.close();
	}

}

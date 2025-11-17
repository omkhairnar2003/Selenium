package VerificationAndValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByWebElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String expected_url="https://demowebshop.tricentis.com";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.get(expected_url);
		try
		{
			driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
			System.out.println("Test Case is Passed");
		}
		catch (Exception e) {
			driver.close();
			throw new Exception("Test case failed");
		}
		Thread.sleep(3000);
		driver.close();
	}

}

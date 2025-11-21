package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCheck {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.className("ico-login"));
		login.click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("Email")).sendKeys("omkhairnar@gmail.com");
		Thread.sleep(1000);   
		
		driver.findElement(By.cssSelector("#Password")).sendKeys("omkhairnar");
		Thread.sleep(1000); 
		
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(2000);
		
		 WebElement logoutBtn = driver.findElement(By.className("ico-logout"));
         if (logoutBtn.isDisplayed()) 
         {
             System.out.println("Login Successful and TestCase PASS");
         }
         else
         {
        	 driver.close();
        	 throw new Exception("Login unsuccessful and TestCase fail");
         }
		
		driver.close();
		
	}

}

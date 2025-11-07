package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTask {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	WebElement register=driver.findElement(By.className("ico-register"));
	register.click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("gender-male")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("FirstName")).sendKeys("Om");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#LastName")).sendKeys("Khairnar");
	Thread.sleep(1000);
	driver.findElement(By.id("Email")).sendKeys("omkhairnar@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#Password")).sendKeys("omkhairnar");
	Thread.sleep(1000);
	driver.findElement(By.id("ConfirmPassword")).sendKeys("omkhairnar");
	Thread.sleep(1000);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(2000);
	driver.close();
}
}

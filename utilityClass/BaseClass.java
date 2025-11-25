package utilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static ChromeDriver driver=null;
	public static void precondition() throws InterruptedException 
	{
		//open the browser
		driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(1000);
		//enter into dws
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void login() throws InterruptedException 
	{
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("omkhairnar@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#Password")).sendKeys("omkhairnar");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}
	public static void logout()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	public static void postCondition() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
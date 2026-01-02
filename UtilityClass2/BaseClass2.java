package UtilityClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass2 {

	public static ChromeDriver driver=null;
	public static void crossBrowser() throws InterruptedException
	{
		WebDriver driver=null;
		String browser="chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void preCondition() throws InterruptedException 
	{
		//open the browser
		driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
	public static void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(2000);
	}
	public static void postCondition() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}
}
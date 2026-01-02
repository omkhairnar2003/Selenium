package Annotations;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
// if we don't define the priority then methods will be executed according to Ascii value of method name
//if priority is same then it will execute as per ascii value
//By default priority will be zero
public class MainMethod 
{
	@Test(dependsOnMethods = "main2")
	public void main1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("M1");
		driver.quit();
	}
	
	@Test(priority = 1)
	public void main2()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		System.out.println("M2");
		driver.quit();
		fail("Because of server");
	}
	
	@Test(priority = -3)
	public void main3()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println("M3");
		driver.quit();
	}
}
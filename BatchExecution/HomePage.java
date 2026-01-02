package BatchExecution;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage 
{
	@Test(groups = "integration")
	public void mi()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mumbaiindians.com/");
		System.out.println("mi");
		driver.quit();
	}
	
	@Test(groups = "integration")
	public void rcb()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.royalchallengers.com/");
		System.out.println("rcb");
		driver.quit();
		fail("Because of server");
	}
	
	@Test(groups = "integration")
	public void csk()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chennaisuperkings.com/");
		System.out.println("csk");
		driver.quit();
	}
}
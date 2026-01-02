package BatchExecution;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login 
{
	@Test(groups = "functional")
	public void qtalk()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chat.qspiders.com/student-dashboard");
		System.out.println("qtalk");
		driver.quit();
	}
	
	@Test(groups = "functional")
	public void ajio()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		System.out.println("ajio");
		driver.quit();
		fail("Because of server");
	}
	
	@Test(groups = "functional")
	public void flipkart()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		System.out.println("flipkart");
		driver.quit();
	}
}
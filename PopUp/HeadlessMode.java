package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String register_url="https://demowebshop.tricentis.com/register";
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(1000);
		String actual_url=driver.getCurrentUrl();
		if(register_url.equals(actual_url))
		{
			System.out.println("Successfully entered into Register page and TestCase pass");
		}
		else
		{
			driver.close();
		    throw new Exception("Enter into register page is unsuccessful TestCase Fail");
		}
		driver.close();
	}

}

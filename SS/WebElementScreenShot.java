package SS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		String local=LocalDateTime.now().toString().replace(":", "-");
		String dynamicName="Searchfield"+local;
		System.out.println(local);
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demowebshop.tricentis.com/");
	     
	    WebElement searchfield = driver.findElement(By.xpath("//div[@class='search-box']"));
	    File from=searchfield.getScreenshotAs(OutputType.FILE);
	    File to=new File("C:\\Users\\OM\\eclipse-workspace\\Automation\\com.crm.SeleniumA13\\src\\SS\\"+dynamicName+".png");
	    FileHandler.copy(from, to);
	     
	    Thread.sleep(3000);
	    driver.quit();
	}
}
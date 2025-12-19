package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class FlipkartHover {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://www.flipkart.com/");
	     Thread.sleep(2000);
	     
	     Actions act=new Actions(driver);
		 WebElement fashion = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		 act.moveToElement(fashion).perform();
		 
		 TakesScreenshot ts=(TakesScreenshot) driver;
	     File from=ts.getScreenshotAs(OutputType.FILE);
	     File to=new File("C:\\Users\\OM\\eclipse-workspace\\Automation\\com.crm.SeleniumA13\\src\\SS\\FlipkartFashion.png");
	     FileHandler.copy(from, to);
	     
	     Thread.sleep(2000);
	     driver.quit();
	}
}
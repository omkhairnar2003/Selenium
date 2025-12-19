package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazoBike {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://www.amazon.in/");
	     
	     driver.findElement(By.className("a-button-text")).click();
	     
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bike");
	     driver.findElement(By.id("nav-search-submit-button")).click();
	     
	     
	     TakesScreenshot ts=(TakesScreenshot) driver;
	     File from=ts.getScreenshotAs(OutputType.FILE);
	     File to=new File("C:\\Users\\OM\\eclipse-workspace\\Automation\\com.crm.SeleniumA13\\src\\SS\\AmazonBike.png");
	     FileHandler.copy(from, to);
	     Thread.sleep(2000);
	     driver.quit();
	}
}
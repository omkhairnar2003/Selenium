package Assignments;

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

public class TwitterSunil {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String local=LocalDateTime.now().toString().replace(":", "-");
		String dynamicName1="coverPhoto"+local;
		String dynamicName2="profilePhoto"+local;
		System.out.println(local);
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://x.com/chetrisunil11");
	     
	    WebElement coverPhoto = driver.findElement(By.xpath("//img[@class='css-9pa8cd']"));
	    File from=coverPhoto.getScreenshotAs(OutputType.FILE);
	    File to=new File("C:\\Users\\OM\\eclipse-workspace\\Automation\\com.crm.SeleniumA13\\src\\SS\\"+dynamicName1+".png");
	    FileHandler.copy(from, to);
	    
	    WebElement profilePhoto = driver.findElement(By.xpath("//div[@class='css-175oi2r r-12181gd r-1pi2tsx r-13qz1uu r-o7ynqc r-6416eg r-1ny4l3l']"));
	    File from2=profilePhoto.getScreenshotAs(OutputType.FILE);
	    File to2=new File("C:\\Users\\OM\\eclipse-workspace\\Automation\\com.crm.SeleniumA13\\src\\SS\\"+dynamicName2+".png");
	    FileHandler.copy(from2, to2);
	     
	    Thread.sleep(3000);
	    driver.quit();
	}
}
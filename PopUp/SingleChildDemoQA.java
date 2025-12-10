package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleChildDemoQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	      driver.get("https://demoqa.com/browser-windows");
	      String parentHandle= driver.getWindowHandle();
	      System.out.println(parentHandle);
	      driver.findElement(By.id("tabButton")).click();
	      Thread.sleep(2000);
	      
	      Set<String> childs=driver.getWindowHandles();
	      System.out.println(childs);
	      
	      for(String str: childs)
	      {
	    	  driver.switchTo().window(str);
	    	  Thread.sleep(1000);
	      }
	      String newTab=driver.findElement(By.id("sampleHeading")).getText();
	      System.out.println(newTab); 
	}
}
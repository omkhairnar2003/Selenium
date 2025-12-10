package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	      driver.get("https://demowebshop.tricentis.com/");
	      String dwsHandle= driver.getWindowHandle();
	      System.out.println(dwsHandle);
	      Actions act=new Actions(driver);
	      act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//a[text()='Facebook'")).click();
	      Thread.sleep(1000);
	      Set<String> childs=driver.getWindowHandles();
	      System.out.println(childs);
	}
}

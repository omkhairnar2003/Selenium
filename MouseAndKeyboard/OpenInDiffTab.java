package MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenInDiffTab {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act=new Actions(driver);
		//Open in diff tab
		WebElement books = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
//		act.keyDown(Keys.CONTROL).click(books).perform();
		
		act.keyDown(Keys.SHIFT).click(books).perform();
	}
}
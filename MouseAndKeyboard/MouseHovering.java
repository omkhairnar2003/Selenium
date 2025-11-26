package MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement genz = driver.findElement(By.xpath("//a[@data-group='genz']"));
		act.moveToElement(genz).perform();
		
		WebElement sweater = driver.findElement(By.xpath("//a[text()='Sweaters Under ₹899']"));
		act.click(sweater).perform();
		
		Thread.sleep(3000);
		driver.close();
	}
}
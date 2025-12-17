package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omayo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
        Actions act  = new Actions(driver);
        
		WebElement drop = driver.findElement(By.className("dropbtn"));
		act.scrollToElement(drop).click(drop).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Facebook')]")));
		
		String parent = driver.getWindowHandle();
	
		WebElement fb = driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
		act.keyDown(Keys.CONTROL).click(fb).keyUp(Keys.CONTROL).perform();

		Set<String> windows = driver.getWindowHandles();

		for (String win : windows) 
		{
		    if (!win.equals(parent)) 
		    {
		        driver.switchTo().window(win);
		        break;
		    }
		}
		
		System.out.println(windows);
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parent);
		Thread.sleep(2000);

		WebElement Timer = driver.findElement(By.xpath("//input[@id='timerButton']"));
		act.click(Timer).perform();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		alt = driver.switchTo().alert();
        System.out.println("Popup says: " + alt.getText());  
        alt.accept();
		
        driver.quit();
	}
}
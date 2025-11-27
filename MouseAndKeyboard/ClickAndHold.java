package MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        Thread.sleep(1000);
//	        driver.get("https://demo.automationtesting.in/Static.html");
	        driver.get("https://demowebshop.tricentis.com/");
	        Thread.sleep(3000);
	        Actions act  = new Actions(driver);
//	        WebElement footer = driver.findElement(By.xpath("//a[@title='Sakinalium Demo Site']"));
//	        WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));

	        // CLICK AND HOLD THE ELEMENT
//	        WebElement source = driver.findElement(By.id("angular"));
//	        WebElement target = driver.findElement(By.id("droparea"));
//	        act.clickAndHold(source).release(target).perform();

//	        // GET TO THAT ELEMENT BY SCROLLING
//	        WebElement selenium = driver.findElement(By.id("node"));
//	        Thread.sleep(2000);
//	        act.scrollToElement(selenium).perform();
//
//	        // GET TO THAT ELEMENT BY SCROLLING UP AND DOWN
//	        act.scrollToElement(footer).perform();
//	        Thread.sleep(3000);
//	        act.scrollToElement(home).perform();
//
//	        // PRESSING THE KEY AND RELEASING THE KEY
//	        Thread.sleep(2000);
//	        act.keyDown(Keys.PAGE_DOWN).perform();
//	        Thread.sleep(2000);
//	        act.keyDown(Keys.PAGE_UP).perform();
//
//	        WebElement searchField = driver.findElement(By.id("small-searchterms"));
//	        act.sendKeys(searchField, "Mobile").perform();
	}

}

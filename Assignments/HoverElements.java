package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		act.moveToElement(men).perform();
		Thread.sleep(1000);
		
		WebElement women = driver.findElement(By.xpath("//a[@data-group='women']"));
		act.moveToElement(women).perform();
		Thread.sleep(1000);
		
		WebElement kids = driver.findElement(By.xpath("//a[@data-group='kids']"));
		act.moveToElement(kids).perform();
		Thread.sleep(1000);
		
		WebElement home = driver.findElement(By.xpath("//a[@data-group='home']"));
		act.moveToElement(home).perform();
		Thread.sleep(1000);
		
		WebElement beauty = driver.findElement(By.xpath("//a[@data-group='beauty']"));
		act.moveToElement(beauty).perform();
		Thread.sleep(1000);
		
		WebElement genz = driver.findElement(By.xpath("//a[@data-group='genz']"));
		act.moveToElement(genz).perform();
		Thread.sleep(1000);
		
		WebElement studio = driver.findElement(By.xpath("//a[@data-group='studio']"));
		act.moveToElement(studio).perform();
		Thread.sleep(1000);
//		act.moveToElement(men).moveToElement(women).moveToElement(kids).moveToElement(home).moveToElement(beauty).moveToElement(genz).moveToElement(studio).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GuruPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		act.contextClick(rightClickMe).click(edit).perform();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
        System.out.println("Popup says: " + alt.getText()); 
        alt.accept();
		
		WebElement cut = driver.findElement(By.xpath("//span[text()='Cut']"));
		act.contextClick(rightClickMe).click(cut).perform();
		Thread.sleep(1000);
		alt = driver.switchTo().alert();
        System.out.println("Popup says: " + alt.getText()); 
        alt.accept();
		
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		act.contextClick(rightClickMe).click(copy).perform();
		Thread.sleep(1000);
		alt = driver.switchTo().alert();
        System.out.println("Popup says: " + alt.getText());   
        alt.accept();
		
		WebElement paste = driver.findElement(By.xpath("//span[text()='Paste']"));
		act.contextClick(rightClickMe).click(paste).perform();
		Thread.sleep(1000);
		alt = driver.switchTo().alert();
        System.out.println("Popup says: " + alt.getText());  
        alt.accept();
		
		WebElement delete = driver.findElement(By.xpath("//span[text()='Delete']"));
		act.contextClick(rightClickMe).click(delete).perform();
		Thread.sleep(1000);
		alt = driver.switchTo().alert();
        System.out.println("Popup says: " + alt.getText());  
        alt.accept();
		
		driver.close();
	}
}

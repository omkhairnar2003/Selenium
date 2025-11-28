package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QspDemo {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.get("https://demoapps.qspiders.com/");
    Thread.sleep(2000);

    Actions act = new Actions(driver);
    driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
    Thread.sleep(2000);

    WebElement dragPosition_01 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
    WebElement dragPosition_02 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
    WebElement target = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
    act.dragAndDrop(dragPosition_01, target).dragAndDrop(dragPosition_02, target).perform();
    Thread.sleep(2000);

    WebElement dragPosition_03 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
    WebElement dragPosition_04 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
    WebElement target_01 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
    act.dragAndDrop(dragPosition_03, target_01).dragAndDrop(dragPosition_04, target_01).perform();
    Thread.sleep(2000);

    //driver.findElement(By.xpath("//a[text()='Drag Multiple']")).click();
    
    Thread.sleep(2000);
}
}
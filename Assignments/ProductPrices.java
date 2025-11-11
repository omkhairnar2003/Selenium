package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPrices {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a)[15]")).click();
		Thread.sleep(1000);
		
		WebElement album3rd=driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div/span"));
		System.out.println(album3rd.getText());
		
		WebElement Music2=driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div/span"));
		System.out.println(Music2.getText());
		
		WebElement Music3=driver.findElement(By.xpath("(//span)[24]"));
		System.out.println(Music3.getText());
		Thread.sleep(3000);
		
		
		driver.close();
	}

}

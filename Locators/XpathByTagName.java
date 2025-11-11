package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input")).sendKeys("Mobile");
		Thread.sleep(2000);
		
		String poll=driver.findElement(By.xpath("(//strong)[5]")).getText();
		System.out.println(poll);
		Thread.sleep(3000);
		
		driver.close();
	}

}

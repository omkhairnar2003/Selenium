package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(2000);
		
		//forward Traversing
//		WebElement album3rd=driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span"));
//		System.out.println(album3rd.getText());
//		Thread.sleep(3000);
		
		// Way 2
		WebElement album3rd=driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div/span"));
		System.out.println(album3rd.getText());
		Thread.sleep(3000);
		
		driver.close();
	}

}
//child traversing-> /tagName
//Parent -> /..
//
//sibling traversing
//forward->following-sibling::tagName
//Backward->preceding-sibling::tagName
// //a[text()='3rd Album']/../../div[3]/div/span
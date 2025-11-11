package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement community =driver.findElement(By.xpath("//strong[text()='Community poll']"));
		System.out.println("text in targeted webElement is :"+community.getText());
		Thread.sleep(5000);
		
		driver.close();
	}

}

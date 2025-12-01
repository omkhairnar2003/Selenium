package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://demo.automationtesting.in/Alerts.html");
        
        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		
		 Alert alt=driver.switchTo().alert();
		 
		 String name="OM";
		 
		 alt.sendKeys(name);
		 
		 alt.accept();
		 
		    String expected_title="Hello "+name+" How are you today";
		    
		    String actual_title = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		    
		    
			if(expected_title.equals(actual_title))
			{
				System.out.println("Data Successfully passed");
			}
			else
			{
				System.out.println("Data passing failed");
				driver.close();
				throw new Exception("Test case failed");
			}
			driver.close();
	}
}
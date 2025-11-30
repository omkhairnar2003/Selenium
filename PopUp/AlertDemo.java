package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://demo.automationtesting.in/Alerts.html");
        
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
        
        Alert alt=driver.switchTo().alert();
		alt.accept();
		
		driver.findElement(By.xpath("//button[contains(text(),'Alert with OK & Cancel ')]")).click();
		
	}

}

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriRegister {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("OM");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("omkhairnar@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("OM@12345");
		Thread.sleep(1000);
		driver.findElement(By.id("mobile")).sendKeys("9857638456");
		Thread.sleep(1000);
		driver.findElement(By.className("main-3")).click();
		Thread.sleep(1000);
		WebElement fileUpload = driver.findElement(By.xpath("//input[@type='file']"));
		fileUpload.sendKeys("C:\\Users\\OM\\Desktop\\New Resume\\Software Developer (OM).docx");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}

package PopUp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderWithoutTextfield {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		//Date formatter
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//today date
		String todayDate=date.format(formatter);
		System.out.println(todayDate);
		
		//Date after 120 days
		LocalDate plus =date.plusDays(120);
		String plusDate=plus.format(formatter);
		System.out.println(plusDate);
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("dvfarecal")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(@id,'"+todayDate+"')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("divRtnCal")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("img2Nex")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("img2Nex")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("img2Nex")).click();
		Thread.sleep(1000);
        
		driver.findElement(By.xpath("//li[contains(@id,'"+plusDate+"')]")).click();
	}
}
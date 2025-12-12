package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidFileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(2000);
		WebElement fileUpload = driver.findElement(By.xpath(" //input[@type='file']"));
		fileUpload.sendKeys("C:\\Users\\OM\\Downloads\\CSS NOTES QSP.docx");
	}
}
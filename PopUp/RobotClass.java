package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		Robot bot=new Robot();
		
		bot.keyPress(KeyEvent.VK_O);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_M);
		Thread.sleep(1000);
		
		bot.keyRelease(KeyEvent.VK_O);
		Thread.sleep(1000);
		bot.keyRelease(KeyEvent.VK_M);
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		driver.quit();
	}

}

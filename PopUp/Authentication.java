package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(3000);
		Robot bot=new Robot();
		
		bot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        
        bot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        
        bot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        
        bot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        
        bot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

	}
}

package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopUP {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
	    
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easemytrip.com/");
        Thread.sleep(3000);

        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);

        bot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);

        bot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);

        bot.keyPress(KeyEvent.VK_ENTER);

        bot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);

        bot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        driver.quit();
    }
}
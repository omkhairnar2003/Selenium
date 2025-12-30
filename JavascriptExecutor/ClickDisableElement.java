package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickDisableElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.oracle.com/in/java/technologies/downloads/");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement jdk = driver.findElement(By.linkText("https://download.oracle.com/java/25/latest/jdk-25_linux-aarch64_bin.rpm"));
        js.executeScript("arguments[0].scrollIntoView(false)", jdk);
        jdk.click();

        WebElement disable_element = driver.findElement(By.linkText("Download jdk-17.0.17_linux-x64_bin.rpm"));
        js.executeScript("arguments[0].click()", disable_element);

        Thread.sleep(2000);

        Object oracleSignUpPage = null;    
		if (driver.getCurrentUrl().equals(oracleSignUpPage)) {
            System.out.println("I have successfully click the disable element");
        } else {
            System.out.println("clicking on disable element is unsuccessful");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
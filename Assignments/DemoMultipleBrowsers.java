package Assignments;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMultipleBrowsers {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(1500);

         
        List<WebElement> followLinks = driver.findElements(
                By.xpath("//div[@class='column follow-us']/ul/li/a"));

        Actions act = new Actions(driver);

        
        for (WebElement ele : followLinks) {
            act.keyDown(Keys.CONTROL).click(ele).keyUp(Keys.CONTROL).perform();
            Thread.sleep(700);
        }

        Set<String> allWindows = driver.getWindowHandles();
        String dwsWindow = driver.getWindowHandle(); 

        for (String win : allWindows) {

            driver.switchTo().window(win);
            String url = driver.getCurrentUrl();
            System.out.println("Opened: " + url);

         
            if (url.contains("facebook.com")) {
                try {
                    Thread.sleep(3000);
                    driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
                    driver.findElement(By.id("pass")).sendKeys("test12345");
                    System.out.println("Facebook credentials entered.");
                } catch (Exception e) {
                    System.out.println("Facebook fields not found.");
                }
            }

            
            else if (url.contains("x.com")) {
                try {
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
                    Thread.sleep(3000);

                    driver.findElement(By.xpath("//input[@autocomplete='name']")).sendKeys("OM");
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys("om@gmail.com");

                    System.out.println("Twitter account form filled.");
                } catch (Exception e) {
                    System.out.println("Twitter signup not found.");
                }
            }

           
            else if (url.contains("youtube.com")) {
                try {
                    Thread.sleep(3000);
                    WebElement search = driver.findElement(By.name("search_query"));
                    search.sendKeys("Shreeman vlogs");
                    search.sendKeys(Keys.ENTER);
                    System.out.println("YouTube search done.");
                } catch (Exception e) {
                    System.out.println("YouTube search not found.");
                }
            }

          
            else if (url.contains("plus.google.com") || url.contains("google.com")) {
                try {
                    Thread.sleep(3000);

                    WebElement admin = driver.findElement(By.xpath("//a[contains(text(),'Admin')]"));
                    WebElement security = driver.findElement(By.xpath("//a[contains(text(),'Security')]"));

                    act.moveToElement(admin).perform();
                    Thread.sleep(1000);
                    act.moveToElement(security).perform();
                    Thread.sleep(1000);

                    WebElement googleVault = driver.findElement(By.xpath("//a[contains(text(),'Google Vault')]"));
                    googleVault.click();

                    System.out.println("Google Vault clicked.");
                } catch (Exception e) {
                    System.out.println("Google+ items not found.");
                }
            }
        }


        driver.switchTo().window(dwsWindow);
        System.out.println("Returned to Demo Web Shop.");

        try {
            WebElement searchBox = driver.findElement(By.id("small-searchterms"));
            searchBox.sendKeys("jewellery");
            searchBox.sendKeys(Keys.ENTER);
            System.out.println("Jewellery searched.");
        } catch (Exception e) {
            System.out.println("Jewellery search box not found.");
        }

        Thread.sleep(3000);

        driver.quit();
    }
}

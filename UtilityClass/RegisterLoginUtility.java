package UtilityClass;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterLoginUtility {
	public static ChromeDriver driver=null;
	
	public static String generatedEmail = null;
	
	public static String password = "Om@1234";
	
	public static void precondition() throws InterruptedException 
	{
		//open the browser
		driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(1000);
		//enter into dws
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	public static void register() throws InterruptedException
	{
        Actions act = new Actions(driver);
	    
	    act.sendKeys(Keys.TAB).perform();
	    Thread.sleep(1000);
	    act.sendKeys(Keys.TAB).perform();
	    Thread.sleep(1000);
	    act.sendKeys(Keys.ENTER).perform();
	    Thread.sleep(1000);
	   for (int i = 0; i < 25; i++) 
	   {
		   act.sendKeys(Keys.TAB).perform();
		  // Thread.sleep(1000);
	   }
	   act.sendKeys(Keys.SPACE).perform();
	   Thread.sleep(1000);
	   act.sendKeys(Keys.TAB).perform();
	   Thread.sleep(1000);
	   act.sendKeys("OM").perform();
	   act.sendKeys(Keys.TAB).perform();
	   Thread.sleep(1000);
	   act.sendKeys("Khairnar").perform();
	   
	   Random RandNum=new Random();
	   int num=RandNum.nextInt(1000);
	   act.sendKeys(Keys.TAB).perform();
	   Thread.sleep(1000);
	   
	   generatedEmail ="omkhairnar"+num+"@gmail.com";
	   act.sendKeys(generatedEmail).perform();
	   act.sendKeys(Keys.TAB).perform();
	   Thread.sleep(1000);
	   
	   act.sendKeys(password);
	   act.sendKeys(Keys.TAB).perform();
	   Thread.sleep(1000);
	   
	   act.sendKeys(password);
	   act.sendKeys(Keys.ENTER).perform();
	   Thread.sleep(2000);
	   
	   act.sendKeys(Keys.TAB).perform();
	   Thread.sleep(1000);
	   
	   act.sendKeys(Keys.TAB).perform();
	   Thread.sleep(1000);
	   
	   act.sendKeys(Keys.TAB).perform();
	   Thread.sleep(1000);
	   
	   act.sendKeys(Keys.ENTER).perform();
	   Thread.sleep(2000);
	}
	
	public static void login() throws InterruptedException
	{
     		Actions act = new Actions(driver);
     		
		    act.sendKeys(Keys.TAB).perform();
		    Thread.sleep(1000);
		    
		    act.sendKeys(Keys.TAB).perform();
		    Thread.sleep(1000);
		    
		    act.sendKeys(Keys.TAB).perform();
		    Thread.sleep(1000);
		    
		    act.sendKeys(Keys.ENTER).perform();
		    Thread.sleep(1000);
		    
		    act.sendKeys(generatedEmail).perform();
		    Thread.sleep(1000);
		    
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			
			act.sendKeys(password).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			
			act.sendKeys(Keys.ENTER).perform();
		    Thread.sleep(1000);
	}
}
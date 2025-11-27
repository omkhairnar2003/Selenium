package MouseAndKeyboard;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		Random r=new Random();
		
//		List<WebElement> sources = new ArrayList<>();
//        sources.add(driver.findElement(By.id("angular")));
//        sources.add(driver.findElement(By.id("mongo")));
//        sources.add(driver.findElement(By.id("node")));
		
		List<WebElement> sources = driver.findElements(By.xpath("//div[@id='dragarea']/div/img"));
        
		WebElement target = driver.findElement(By.id("droparea"));
		
		  for (int i = 0; i < 9; i++) 
		  {
			    int index = r.nextInt(0,3);
	            act.dragAndDrop(sources.get(index), target).perform();
	            Thread.sleep(1000);
		  }
//		WebElement source1 = driver.findElement(By.id("angular"));
//		WebElement target1 = driver.findElement(By.id("droparea"));
//		
//		WebElement source2 = driver.findElement(By.id("mongo"));
//		WebElement target2 = driver.findElement(By.id("droparea"));
//		
//		WebElement source3 = driver.findElement(By.id("node"));
//		WebElement target3 = driver.findElement(By.id("droparea"));
//		act.dragAndDrop(source1, target1).dragAndDrop(source2, target2).dragAndDrop(source3, target3).perform();
		  
}
}
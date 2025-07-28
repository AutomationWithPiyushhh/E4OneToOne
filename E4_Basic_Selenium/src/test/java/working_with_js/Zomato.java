package working_with_js;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.location='https://www.zomato.com/';");
		
		System.out.println(jse.executeScript("return document.title"));
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(500);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(500);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(500);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(500);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(500);

		
//		Scrolling
//		jse.executeScript("window.scrollTo(0,500)");
//		Thread.sleep(500);
//		jse.executeScript("window.scrollTo(0,500)");
//		Thread.sleep(500);
//		jse.executeScript("window.scrollTo(0,500)");
//		Thread.sleep(500);
//		jse.executeScript("window.scrollTo(0,500)");
//		Thread.sleep(500);
//		jse.executeScript("window.scrollTo(0,500)");
		
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		
		Thread.sleep(500);
		driver.quit();
	}
}

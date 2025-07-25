package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}
}

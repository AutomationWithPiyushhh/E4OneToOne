package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuApp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
//		driver.findElement(By.xpath("//button[text()='Remove']")).click();
////		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[text()='Add']")).click();

		
		driver.findElement(By.xpath("//button[text()='Enable']")).click();

		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.ignoring(TimeoutException.class);
		wait.pollingEvery(Duration.ofSeconds(2));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qwerty");

		
	}
}

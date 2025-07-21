package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		
//		act.contextClick().build().perform();

		
		
		WebElement login = driver.findElement(By.name("login"));
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
//		login.click();
		
		act.contextClick(login).build().perform();
//		act.click(login).perform();
		
//		act.moveToElement(link).build().perform();
//		Thread.sleep(5000);
//		act.click().perform();
	}
}

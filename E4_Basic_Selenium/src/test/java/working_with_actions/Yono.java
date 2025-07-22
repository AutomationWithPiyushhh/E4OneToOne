package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yono {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://yonobusiness.sbi/yonobusinesslogin");

		driver.findElement(By.id("password")).sendKeys("admin");

		Actions act = new Actions(driver);
		WebElement eye = driver.findElement(By.cssSelector("img[src='assets/img/Revamp/icon_eye_close.svg']"));

		act.clickAndHold(eye).build().perform();

		act.release().build().perform();
	}
}

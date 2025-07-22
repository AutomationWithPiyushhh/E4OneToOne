package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBookKeyboard {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		Actions act = new Actions(driver);

//		act.sendKeys("admin" + Keys.TAB + "admin" + Keys.ENTER).perform();

		act.sendKeys("admin").build().perform();

		act.keyDown(Keys.CONTROL).build().perform();
//		copy krne ka code
		act.keyUp(Keys.CONTROL).build().perform();

		act.sendKeys(Keys.TAB).perform();
//		paste krne ka code

	}
}

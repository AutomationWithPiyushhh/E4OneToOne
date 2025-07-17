package working_with_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/r.php?entry_point=login");

		WebElement dayDD = driver.findElement(By.id("day"));
		Select selDay = new Select(dayDD);
		selDay.selectByIndex(20);

		WebElement monthDD = driver.findElement(By.id("month"));
		Select selMon = new Select(monthDD);
		selMon.selectByValue("6");

		WebElement yearDD = driver.findElement(By.id("year"));
		Select selYear = new Select(yearDD);
		List<WebElement> years = selYear.getOptions();

		for (WebElement i : years) {
			String text = i.getText();
			System.out.println(text);
		}

		Thread.sleep(3000);
		driver.quit();
	}
}

package working_with_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/r.php?entry_point=login");

		WebElement dayDD = driver.findElement(By.id("day"));
		Select selDay = new Select(dayDD);
		selDay.selectByIndex(10);

		WebElement monthDD = driver.findElement(By.id("month"));
		Select selMonth = new Select(monthDD);
//		selMonth.selectByIndex(10);
		selMonth.selectByValue("7");

		WebElement yearDD = driver.findElement(By.id("year"));
		Select selYear = new Select(yearDD);
//		selYear.selectByIndex(14);
		selYear.selectByVisibleText("2009");

		List<WebElement> year = selYear.getOptions();
		for (WebElement i : year) {
			System.out.println(i.getText());
		}

	}
}

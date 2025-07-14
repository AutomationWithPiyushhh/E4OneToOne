package working_with_searchcontext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WorkingWithRL {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/r.php?entry_point=login");

		driver.findElement(RelativeLocator
				.with(By.cssSelector("input[aria-label='Surname']")) // desired element locator
				.toRightOf(By.name("firstname")) // reference element locator
				)
				.sendKeys("Malhar");
	}
}

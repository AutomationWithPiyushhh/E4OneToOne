package working_with_searchcontext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLoc2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("admin");

		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("admin@123");
		
//		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.linkText("Forgotten")).click();
		
	}
}

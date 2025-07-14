package working_with_we;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("admin");
//		Thread.sleep(2000);
		un.clear();

		WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		link.click();

		driver.navigate().back();

//		Thread.sleep(3000);

		WebElement login = driver.findElement(By.name("login"));
//		login.submit();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement male = driver.findElement(By.cssSelector("input[value='2']"));

		boolean disp = male.isDisplayed();
		boolean enab = male.isEnabled();
		if (disp && enab) {
			male.click();
		}
		boolean sele = male.isSelected();
		if (sele) {
			System.out.println("Male is already selected");
		}else {
			male.click();
			System.out.println("Now male is selected...");
		}
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}

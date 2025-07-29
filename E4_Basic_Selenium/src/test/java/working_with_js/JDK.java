
package working_with_js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDK {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.oracle.com/java/technologies/javase-jdk24-doc-downloads.html");
		
		driver.findElement(By.linkText("jdk-24.0.2_doc-all.zip")).click();
		
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("jdk-24.0.2_doc-all.zip"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", link);
		
		
		
		jse.executeScript("window.location='https://www.facebook.com/';");
		
		WebElement un = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		
		String username = "admin";
		un.sendKeys(username);
		
		String password = "12345678910111213";
		jse.executeScript("arguments[0].value=arguments[1];",pwd,password);
//		jse.executeScript("arguments[0].click();",un);
	}
}

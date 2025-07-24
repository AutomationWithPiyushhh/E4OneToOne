package taking_ss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		TakesScreenshot tks = (TakesScreenshot) driver;
		File source1 = tks.getScreenshotAs(OutputType.FILE);	
		File destination1 = new File("C:\\Users\\User\\git\\E4OneToOne\\E4_Basic_Selenium\\src\\test\\java\\taking_ss\\home1.png");
	
		FileHandler.copy(source1, destination1);
	}

}

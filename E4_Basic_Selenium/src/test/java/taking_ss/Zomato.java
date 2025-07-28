package taking_ss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Zomato {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.zomato.com/");

//		Take the ss of zomato pic
		
		WebElement pic = driver.findElement(By.xpath("//a[@href=\"https://www.zomato.com/restaurants\"]/.."));
		
		File source1 = pic.getScreenshotAs(OutputType.FILE);	
		File destination1 = new File("C:\\Users\\User\\git\\E4OneToOne\\E4_Basic_Selenium\\src\\test\\java\\taking_ss\\zoomm.png");
	
		FileHandler.copy(source1, destination1);
	}

}

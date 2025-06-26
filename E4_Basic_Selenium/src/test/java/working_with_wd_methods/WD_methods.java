package working_with_wd_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_methods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/"); //InvalidArgumentException
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
//		String sourceCode = driver.getPageSource();
//		System.out.println(sourceCode);
		
		
		
		
		
		driver.quit();
	}

}

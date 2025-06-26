package working_with_wd_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");

		Window win = driver.manage().window();

//		win.maximize();
//		Thread.sleep(500);
//		win.minimize();
//		Thread.sleep(500);
//		win.fullscreen();

		Dimension dim = win.getSize();
		System.out.println(dim);
		
		 int height = dim.getHeight();
		
		System.out.println("height is : " + height);
		
		int width = dim.getWidth();
		
		System.out.println("width is : " + width);
		
		
		Dimension dim2 = new Dimension(1000	,500);
		win.setSize(dim2);
		

		Thread.sleep(2000);
		driver.quit();
	}
}

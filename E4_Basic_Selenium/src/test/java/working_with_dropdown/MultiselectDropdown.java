package working_with_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("file:///C:/Users/User/git/E4OneToOne/E4_Basic_Selenium/src/test/java/working_with_dropdown/multiselect.html");
		
		WebElement carDD = driver.findElement(By.id("cars"));
		Select selCar = new Select(carDD);
//		selCar.selectByIndex(0);
//		Thread.sleep(1000);
		selCar.selectByIndex(2);
		Thread.sleep(1000);
		selCar.selectByIndex(1);
		
		
		Thread.sleep(500);
		boolean status = selCar.isMultiple();
		if(status) {
			System.out.println("given dd is multiselect");
		}
		
//		selCar.deselectAll();
		
//		MISCELLANEOUS
		WebElement firstEle = selCar.getFirstSelectedOption();
		System.out.println(firstEle.getText());
		
		List<WebElement> selectedAll = selCar.getAllSelectedOptions();
		for (WebElement i : selectedAll) {
			System.out.println(i.getText());
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}

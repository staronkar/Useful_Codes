package Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllElements {


	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		String driverPath = "C:\\Users\\ASUS\\Desktop\\Automation Folder\\";
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.sonyliv.com/");

		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("Number of links is :"+list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		
		driver.navigate().to("https://www.pepperfry.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.quit();
		System.out.println("Run Complete");
	}

}

package Tutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		String driverPath = "C:\\Users\\ASUS\\Desktop\\Automation Folder\\";
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		Thread.sleep(3000);
		Set<String> handle = driver.getWindowHandles();
		System.out.println("Handle name is : "+handle);
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		 handle = driver.getWindowHandles();
		 System.out.println("Handle name is : "+handle);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@onclick='newMsgWin()']")).click();
		 System.out.println("Handle name is : "+handle);
		 for(String handleNew : handle) {
			 System.out.println("Handle name is : "+handleNew);
			 driver.switchTo().window(handleNew);
			 Thread.sleep(2000);
		 }
		
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Run Completed");
	}

}

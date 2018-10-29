package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		String driverPath = "C:\\Users\\ASUS\\Desktop\\Automation Folder\\";
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='uploadfile_0']")).sendKeys("C:\\Users\\ASUS\\Desktop\\abc.txt.txt");

		Thread.sleep(3000);
		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Run Completed");


	}

}

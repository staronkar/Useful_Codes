package Sept_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testDataProvider {

	public static String driverPath = "C:\\Users\\ASUS\\Desktop\\Automation Folder\\";
	public WebDriver driver;

	@BeforeSuite
	public void openDevice() {
		System.out.println("Run Started");
	}

	@BeforeTest
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	@Test
	public void testMethod() {
		System.out.println("Run test");
	}

	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Cloing brower");
		driver.close();
	}

}

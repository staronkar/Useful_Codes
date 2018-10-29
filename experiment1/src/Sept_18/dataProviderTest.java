package Sept_18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTest {
	public static String driverPath = "C:\\Users\\ASUS\\Desktop\\Automation Folder\\";
	public static WebDriver driver;
	@BeforeTest
	public static void beforeTestMethod() {
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@DataProvider(name="TestData") 
	public Object[] getData() {
		Object[]  data= new Object[2];
		data[0] ="http://softwaretestingmaterial.com";
		data[1]="https://www.restapitutorial.com/";

		return data;
	}

	@Test(dataProvider="TestData")
	public static void testMethod(String url) {
	//	String url = "http://softwaretestingmaterial.com";

		String actualTitle=null;
		driver.get(url);
		actualTitle=driver.getTitle();

		System.out.println("Actual Value is "+actualTitle);
		System.out.println("Test Passed");

	}

	@AfterTest
	public static void afterTestMethod() {
		driver.close();
	}

}

package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath = "C:\\Users\\ASUS\\Desktop\\Automation Folder\\";
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://softwaretestingmaterial.com";
		String expectedTitle= "Software Testing Material";
		String actualTitle=null;
		driver.get(url);
		actualTitle=driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
			 //'system.out.println' prints the output
			 System.out.println("Expected Value is "+expectedTitle);
			 System.out.println("Actual Value is "+actualTitle);
			 System.out.println("Test Passed");
			 } else {
			 System.out.println("Expected Value is "+expectedTitle);
			 System.out.println("Actual Value is "+actualTitle);
			 System.out.println("Test Failed");
			 }
		driver.close();

	}

}

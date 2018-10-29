package Tutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopups {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		try {
			String driverPath = "C:\\Users\\ASUS\\Desktop\\Automation Folder\\";
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert Message is : "+alert.getText());
			alert.accept();
			
//	driver.close();
			driver.quit();
			System.out.println("Run Complete");
		} catch (Exception e) {
			driver.quit();
			System.out.println("In exception");
			e.printStackTrace();
		}

	}

}

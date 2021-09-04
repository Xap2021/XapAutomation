/*** Coded by Chirag Patel ****/
package driverinstance;
import org.openqa.selenium.chrome.ChromeDriver;

//createInstance()
public class MainDriver 
{
	public static ChromeDriver driver;
	public static void CreateInstance() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Xap Selenium Project\\SeleniumXapProject\\src\\main\\resources\\ChromeDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
	}
	
}

/*** Coded by Chirag Patel ****/
package driverinstance;
import org.openqa.selenium.By;

public class OpenFamilyFromMenu004 extends MainDriver
{
	public static void openfamily() throws InterruptedException 
	{
		driver.findElement(By.xpath("/html/body/xap-root/xap-dashboard-layout/nz-layout/nz-layout/xap-navbar/div/dx-scroll-view/div[1]/div/div[1]/div[2]/aside/div/div[2]/ul/li[4]/a")).click();

		Thread.sleep(5000);

	}
}

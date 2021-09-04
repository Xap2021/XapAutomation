/*** Coded by Chirag Patel ****/
package driverinstance;

import org.openqa.selenium.By;

public class OpenMenu003 extends MainDriver
{
	public static void menuopen() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"Path-2\"]")).click();
		Thread.sleep(5000);
		 
	}

}

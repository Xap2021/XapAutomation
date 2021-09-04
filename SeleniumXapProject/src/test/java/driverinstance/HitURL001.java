/*** Coded by Chirag Patel ****/
package driverinstance;

 

public class HitURL001 extends MainDriver
{
	public static void url() throws InterruptedException
	{
		MainDriver.CreateInstance();
		 driver.navigate().to("https://id.qa.kidsxap.com.au/Account/Login");
		Thread.sleep(3000);
	}
}

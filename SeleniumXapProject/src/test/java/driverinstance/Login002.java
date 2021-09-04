/*** Coded by Chirag Patel ****/
package driverinstance;

import org.openqa.selenium.By;

public class Login002 extends MainDriver 
{
	public static void login() throws InterruptedException 
	{
		//Enter User Name		
		driver.findElement(By.xpath("/html//input[@id='txtUserName']")).sendKeys("kabeer.osias@fineoak.org");
		Thread.sleep(1000);
		//Enter Password
		driver.findElement(By.xpath("/html//input[@id='txtPassword']")).sendKeys("Admin@123");
		Thread.sleep(1000);
		//Click on Login button
		driver.findElement(By.xpath("/html//button[@id='btnLogin']")).click();
		Thread.sleep(9000);
	}

}

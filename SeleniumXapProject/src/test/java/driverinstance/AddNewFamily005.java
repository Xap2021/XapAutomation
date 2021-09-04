/*** Coded by Chirag Patel ****/
package driverinstance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AddNewFamily005 extends MainDriver 
{	
	public static void addfamily() throws InterruptedException 
	{
		//int  j=4;
		for(int i=4;i<=5;i++) {
			
// Click On add record button
			//j++;
			Thread.sleep(9000);
			 
			  driver.findElement(By.xpath("//1111div[@id='btnFamilySearchAdd']/a[@title='Add Family']")).click(); 
			  
		  
 //Open Centre Drop-down
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("/html//dx-select-box[@id='ddlCentre']//input[@role='combobox']")).click();
			  Thread.sleep(5000);
			  
			  driver.findElement(By.xpath("//div[@class='dx-scrollview-content']/div[2]/div[@class='dx-item-content dx-list-item-content']")).click();
			  Thread.sleep(5000);
			
//Guardian First Name 
			  driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddFamilyFirstName']//input[@role='textbox']")).sendKeys("Guardian");
			  Thread.sleep(1000);
//Guardian Last Name
			  driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddFamilyLastName']//input[@role='textbox']")).sendKeys(""+i); 
//Guardian Date of Birth 
			  
			  driver.findElement(By.xpath("/html//dx-date-box[@id='dtAddFamilyDOB']//input[@role='combobox']")).sendKeys("01/01/1988"); 
			  Thread.sleep(1000);
// Add Guardian Email Address
			  driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddFamilyEmail']//input[@role='textbox']")).sendKeys("Xap"+i+"@noemailxap.com"); 
			  Thread.sleep(1000);
// Add Mobile Number
			  driver.findElement(By.xpath("/html//dx-text-box[@id='txtHeadOfficeMobileNumber']//input[@role='textbox']")).sendKeys("0443432323"); 
			  Thread.sleep(1000);
			  
			  
//Add Street Address 
			   driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddOrganisationStreetAddress']//input[@role='textbox']")).sendKeys("678 Victoria Road");
			   Thread.sleep(3000);
//Add Suburb 
			   
			 driver.findElement(By.xpath("/html//dx-autocomplete[@id='autAddOrganisationSuburb']//input[@role='combobox']")).sendKeys("Ryde");
			 Thread.sleep(3000);
// Open State drop-down 
			  driver.findElement(By.xpath("/html//dx-select-box[@id='ddlAddOrganisationState']//div[@role='button']//div[@class='dx-dropdowneditor-icon']")).click(); 
			  Thread.sleep(3000);
		
			  driver.findElement(By.xpath("//div[contains(text(),'ACT')]")).click();
// Set Post Code 
			  driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddOrganisationPostcode']//input[@role='textbox']")).sendKeys("2112"); 
			  Thread.sleep(3000);

			  WebElement webElement = driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddOrganisationPostcode']//input[@role='textbox']"));
			  webElement.sendKeys(Keys.TAB);
// Add Child First Name
			  Thread.sleep(3000);
			  
			  driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddFamilyChildFirstName']//input[@role='textbox']")).sendKeys("Child"); 
			  Thread.sleep(1000);
// Add Child Last Name
			  driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddFamilyChildLastName']//input[@role='textbox']")).sendKeys(""+i); 
			  WebElement webElement5 = driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddFamilyChildLastName']//input[@role='textbox']"));
			  webElement5.sendKeys(Keys.TAB);
			  Thread.sleep(1000);
// Add Child Birthday
			  driver.findElement(By.xpath("/html//dx-date-box[@id='dtAddFamilyChildDOB']//input[@role='combobox']")).sendKeys("01/01/1989"); 
			  Thread.sleep(1000);
// Add Payment Method

			driver.findElement(By.xpath("//div[1]/div/div[1]/div[2]/div/div[7]/div[1]/div")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@role='listbox']//div[@class='dx-scrollview-content']/div[1]//div[text()='Direct Debit']")).click();
						 
// Add Family Name
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddFamilyName']//input[@role='textbox']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddFamilyName']//input[@role='textbox']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html//dx-text-box[@id='txtAddFamilyName']//input[@role='textbox']")).sendKeys("Family-0"+i);
			Thread.sleep(1000);
// Save Record
			driver.findElement(By.xpath("//dx-button[@id='btnAddProviderSave']//span[@class='dx-button-text']")).click();
			Thread.sleep(9000);
		}
	}
}	
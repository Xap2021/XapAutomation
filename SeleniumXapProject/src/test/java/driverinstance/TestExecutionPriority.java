/*** Coded by Chirag Patel ****/
package driverinstance;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestExecutionPriority 
{
	@Test (priority = 0)
	public void url() throws InterruptedException
	{
		HitURL001.url();
	}
	@Test (priority = 1)
	public void login() throws InterruptedException
	{
		Login002.login();
	}
	@Test (priority = 2)
	public void OpenMenu003() throws InterruptedException
	{
		OpenMenu003.menuopen();
	}
	@Test (priority = 3)
	public void OpenFamilyFromMenu004() throws InterruptedException
	{
		OpenFamilyFromMenu004.openfamily();
	}
	@Test (priority = 4)
	public void AddNewFamily005() throws InterruptedException
	{
		AddNewFamily005.addfamily();
	}
}

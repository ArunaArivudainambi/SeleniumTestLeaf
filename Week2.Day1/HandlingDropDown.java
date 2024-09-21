package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver obj= new ChromeDriver();
		obj.get("http://leaftaps.com/opentaps");
		Thread.sleep(5000);
		obj.findElement(By.id("username")).sendKeys("demosalesmanager");
		obj.findElement(By.id("password")).sendKeys("crmsfa");
		obj.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(5000);
		obj.findElement(By.className("crmsfa")).click();
		Thread.sleep(2000);
		obj.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		obj.findElement(By.linkText("Create Lead")).click(); 
		Thread.sleep(2000);
		obj.findElement(By.id("createLeadForm_firstName")).sendKeys("Aruna");
		obj.findElement(By.id("createLeadForm_lastName")).sendKeys("Arivudainambi");
		obj.findElement(By.id("createLeadForm_companyName")).sendKeys("Varu Trading");
		WebElement dd1=obj.findElement(By.id("createLeadForm_dataSourceId"));
		Select ddsel1=new Select(dd1);
		ddsel1.selectByIndex(4);
		WebElement dd2=obj.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select ddsel2=new Select(dd2);
		ddsel2.selectByVisibleText("Automobile");
		WebElement dd3=obj.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ddsel3=new Select(dd3);
		ddsel3.selectByValue("OWN_CCORP");
		obj.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		System.out.println("Current web page Title is '"+ obj.getTitle()+" '");
		Thread.sleep(2000);
		obj.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		//obj.findElement(By.name("firstName")).sendKeys("Aruna");
		/*WebElement a= obj.findElement(By.name("firstName"));
		a.click();
		a.sendKeys("Aruna");*/
		//obj.findElement(By.name("lastName")).sendKeys("Arivudainambi");
		//obj.findElement(By.name("companyName")).sendKeys("Varu Trading");
		//Thread.sleep(2000);
		//WebElement e = obj.findElement(By.id("ext-gen937"));
		//System.out.println("Lead Id created is " + e.getText());
		obj.quit();
	}

}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonSearchwithRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver obj= new EdgeDriver();
		obj.manage().window().maximize();
		obj.get("https://www.amazon.in/");
		Thread.sleep(5000);
		/*WebElement b1= obj.findElement(By.id("glow-ingress-line2"));
		b1.click();
		WebElement b2= obj.findElement(By.id("GLUXZipUpdateInput"));
		b2.sendKeys("600077");	
		WebElement b3= obj.findElement(By.xpath("//input[contains(@class,'a-button-input')][3]")); // Index or Collection based Xpath 	
		b3.click();	*/
		obj.findElement(By.id("twotabsearchtextbox")).sendKeys("Butterfly Pressure cooker"); // Basic Xpath
		WebElement a1= obj.findElement(By.xpath("//input[contains(@id,'nav-search')]")); // Partial Attribute based Xpath 	
		a1.click();		
		Thread.sleep(5000);
		WebElement a2= obj.findElement(By.xpath("//span[text()='Butterfly']"));
		a2.click();
		Thread.sleep(5000);
		System.out.println("Page Title is '"+ obj.getTitle()+" '");
		obj.quit();
	}

}



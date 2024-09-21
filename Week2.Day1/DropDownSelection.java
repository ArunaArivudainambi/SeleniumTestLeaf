package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver obj= new EdgeDriver();
		obj.manage().window().maximize();
		obj.get("https://www.leafground.com/select.xhtml");
		Thread.sleep(5000);
		WebElement dd=obj.findElement(By.className("ui-selectonemenu"));
		dd.click();
		Select dd1=new Select(dd);
		dd1.selectByVisibleText("Selenium");
	}
}

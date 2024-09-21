package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LoadURL_Locators {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver obj= new EdgeDriver();
		obj.manage().window().maximize();
		obj.get("https://www.facebook.com");
		Thread.sleep(5000);
		obj.findElement(By.id("email")).sendKeys("testleaf.2024@gmail.com");
		obj.findElement(By.id("pass")).sendKeys("Tuna@321");
		//obj.findElement(By.name("login")).click();
		Thread.sleep(5000);
		obj.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(5000);
		System.out.println("Page Title is '"+ obj.getTitle()+" '");
		obj.quit();
	}

}

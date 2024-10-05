package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class A_pvrcinemas {

	public static void main(String[] args) 
	{
		ChromeDriver obj= new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("https://www.pvrcinemas.com");

	}

}

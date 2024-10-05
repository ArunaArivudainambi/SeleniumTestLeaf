package week3.day1;

public class C_Edge_Methodoverriding extends C_Browser_Methodoverriding
{

	public void openURL(String a)
	{
		System.out.println("This is printed from the class C_Edge_Methodoverriding");
	}
	public static void main(String[] args) 
	{
		C_Edge_Methodoverriding obj1= new C_Edge_Methodoverriding();
		obj1.openURL();
		obj1.openURL("Test");

	}

}

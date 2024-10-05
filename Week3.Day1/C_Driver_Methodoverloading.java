package week3.day1;

public class C_Driver_Methodoverloading 
{

	public void loadUrl(String url,boolean status)
	{
		System.out.println("Printing values from 2 argument method and are" + url + " " + status);
	}
	public void loadUrl(String url)
	{
		System.out.println("Printing value from 1 argument method and is" + url);
	}
	public static void main(String[] args) 
	{
			C_Driver_Methodoverloading obj= new C_Driver_Methodoverloading();
			obj.loadUrl("Google", true);
			obj.loadUrl("Yahoo");
		
		
	}

}


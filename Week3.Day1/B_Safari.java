package week3.day1;

public class B_Safari extends B_Edge
{
	public void readerMode()
	{
		System.out.println("Reader Mode");
	}
	public void fullScreenMode()
	{
		System.out.println("Full Screeen mode");
	}
	public static void main(String[] args) 
	{
		B_Safari obj = new B_Safari();
		obj.openURL();
		obj.closeBrowser();
		obj.navigateBack();
		obj.openIncognito();
		obj.clearCache();
		obj.takeSnap();
		obj.clearCookies();
		obj.readerMode();
		obj.fullScreenMode();
		
	}
}

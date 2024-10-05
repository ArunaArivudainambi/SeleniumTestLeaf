package week3.day1;

public class D_ReverseString {

	public static void main(String[] args) 
	{
		//System.out.println("Enter the string");
		String var= "Testing";
		int len1=var.length();
		//System.out.println("The actual string is "+ var );
		char [] ch1=var.toCharArray();
		for (int i=len1-1;i>=0;i--)
		{
			System.out.print(ch1[i]);
		}

	}

}

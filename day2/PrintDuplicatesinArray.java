package week1.day2;

import java.util.Arrays;

public class PrintDuplicatesinArray 
{

	public static void main(String[] args) 
	{
		int num[] = {2,5,7,7,5,9,2,3};
	/*	int i=num.length;
		int a=0;
		int num1[]= new int[i];
		for (int j=0;j<i;j++)
		{
			num1[a]=num[j];     // Copies the array to a new array
			a++;
		}
	*/
		Arrays.sort(num);
		for (int k=0;k<num.length-1;k++)
		{
				if(num[k]==num[k+1])
				{
				System.out.println("Duplicate number found is "+num[k]);
				}
		}
	}
}

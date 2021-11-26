package lab4;
import java.util.*;
import java.util.Scanner;

public class exsix {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("===== To check if an array has a given value=====");
		int[] arr= {1,231,343,564,238,235,75,3435,53,87,98,23,45};
		System.out.println(" Enter the number to be checked");
		int n = s.nextInt();
		int l=arr.length;
		int i, count=0,pos=0;
		for(i=0;i<l;i++)
		{
			if(arr[i]==n)
				{
				count++;
				pos=i;
				}
		}
		if(count>0)
		System.out.println(" The entered number "+ n+ " is found at postion "+pos);
		else
			System.out.println(" Number not found");
		
		 	
	}

}

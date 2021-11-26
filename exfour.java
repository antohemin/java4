package lab4;
import java.util.Scanner;

public class exfour {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("=====Concatanate 2 arrays====");
		System.out.println(" Enter the length of the first array");
		int n= s.nextInt();
		int arr[]= new int[n];
		System.out.println(" Enter the elements in the first array");
		for(int i =0; i<n; i++)
		{
			arr[i]= s.nextInt();
		}
		System.out.println(" Enter the length of the second array");
		int m = s.nextInt();
		int brr[]= new int[m];
		System.out.println(" Enter the elements in the second array");
		for(int i=0; i<m;i++)
		{
			brr[i]=s.nextInt();
		}
		int k=m+n, pos=0;
		int crr[]= new int[k];
		for(int i= 0; i<n; i++)
		{
			crr[i]=arr[i];
			pos++;
		}
		for(int i=0;i<m;i++)
		{
			crr[pos]=brr[i];
			pos++;
		}
		System.out.println(" The Concatanated array is ");
		for(int i=0; i<k; i++)
		{
			System.out.print(crr[i]+" ");
		}
	}
	

}

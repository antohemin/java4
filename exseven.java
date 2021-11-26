package lab4;
import java.util.*;
import java.util.Scanner;

public class exseven {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the string");
		String str= s.nextLine();
		int l= str.length();
		if(l>0)
			System.out.println(" The string is not empty");
		else
		System.out.println(" The String is empty");
	}

}

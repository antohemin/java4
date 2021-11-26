package lab4;
import java.util.*;
import java.util.Scanner;

public class exfive {
	public static void main(String[] args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" String to Char and Vice Versa");
		System.out.println("Enter the String to be converted");
		String st=s.nextLine();
		System.out.println(" Enter the character to be converted");
		char ch= s.next().charAt(0);
		String c= Character.toString(ch);
		char[] ct= st.toCharArray();
		System.out.println(" Enterd character = "+ch);
		System.out.println(" Converted String = "+ c);
		System.out.println(" Entered String = " + st);
		System.out.println(" Convereted character = "+Arrays.toString(ct));
		
		/*System.out.println(" =====Operations =======");
		System.out.println(" Enter 1 for String to character ");
		System.out.println(" Enter 2 for Character to String ");
		int n = s.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.println("Enter the String to be converted");
				String st=s.nextLine();
				char[] ct= st.toCharArray();
				System.out.println(" Entered String = " + st);
				System.out.println(" Convereted character = "+Arrays.toString(ct));
				break;
			}
			case 2:
			{
				System.out.println(" Enter the character to be converted");
				char ch= s.next().charAt(0);
				String c= Character.toString(ch);
				System.out.println(" Enterd character = "+ch);
				System.out.println(" Converted String = "+ c);
				break;
			}
			default: 
				System.out.println(" Wrong Input");
			
		}*/
	}
}


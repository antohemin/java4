package lab4;
import java.util.*;
import java.text.DecimalFormat;

public class exthree {
	public static void main(String[] args) throws Exception
	{
		Scanner s= new Scanner(System.in);
		System.out.println(" Rounding of a number");
		System.out.println("");
		System.out.println(" Enter the number to be rounded off to");
		double a =s.nextDouble();
		//double b =1.23232323;
		//System.out.println(" Enter the decimal point to which it needs to be rounded of to");
		//double n=s.nextDouble();
		System.out.print(" The rounded off number will be = ");
		System.out.format("%.2f", a);
	}

}

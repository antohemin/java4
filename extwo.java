package lab4;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class extwo {
	public static void main(String[] args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" =======String to Date========= ");
		System.out.println("");
		System.out.println("");
		System.out.println(" Enter a date in the format dd/mm/yyyy ");
		String sdate = s.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		Date date = format.parse(sdate);
		System.out.println(" Input Date = "+ sdate);
		System.out.println(" Output Date = "+ date);
	}

}

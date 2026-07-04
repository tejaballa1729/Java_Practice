import java.util.*;
public class Variables
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		byte byte1;
		int short1;
		int int1;
		long long1;
		float float1;
		double double1;
		char char1;
		String	string1;
/*		byte1 = 2;
		short1 = (short) byte1*byte1;
		int1 = short1*short1;
		long1 = short1*short1;
		float1 = long1*long1;
		double1 = float1*float1;
		char1 = (char) long1;
		string1 = "All Vaiables Tested 0!0";
		System.out.println("Byte Value " + byte1);
		System.out.println("short Value " + short1);
		System.out.println("int Value " + int1);
		System.out.println("long  Value " + long1);
		System.out.println("float Value " + float1);
		System.out.println("double Value " + double1);
		System.out.println("char Value " + char1);
		System.out.println("String is : " + string1);	*/
		System.out.println("Enter any number between : " + Integer.MAX_VALUE + "to" + Integer.MIN_VALUE);
		int inti = scanner.nextInt();
		if ( inti%2 == 0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
}
import java.util.*;
//** this is a interactive program 
public class Recursion
{
	public static void AddSum(int a)
	{
		switch(a)
		{
			case 1:
			System.out.println("Sun");
			break;
			case 2:
			System.out.println("mon");
			break;
			case 3:
			System.out.println("tues");
			break;
			case 4:
			System.out.println("wen");
			break;
			case 5:
			System.out.println("thur");
			break;
			default:
			System.out.println("enter value less then 6");
			break;
		}
	}
	public static void main(String[] args)
	{
		int a;
		String operator;
		Scanner in_Put = new Scanner(System.in);
		System.out.println("Enter Start command to start the program");
		operator =in_Put.nextLine();
		if (operator.equals("Start") || operator.equals("start"))
		{
			do
			{
				operator = in_Put.nextLine();
				if (operator.equals("end") || operator.equals("End"))
					break;
				else
				{
					a=Integer.parseInt(operator);
					AddSum(a);
				}
			}	while(a!=0);
		}
		else 
			System.out.println("Retry again");
	}
}
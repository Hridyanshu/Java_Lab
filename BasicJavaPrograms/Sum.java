/* Program to add two integers using command line arguments */

public class Sum
{
	public static void main(String args[])
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		System.out.println("Sum:"+(num1+num2));
	}
}

/* Write a program to get the largest of the three integers */

public class Comparison_3_numbers
{
	public static void main (String args[])
	{
		//The below section is used to change the recieved command lines argument into integers.
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);

		//This block is used for comparison purpose.
		//First we will compare first two inputs and store the result in another variable.
		int temp_result = ((num1>num2)?num1:num2);
		//Now we will compare the result of first two with the third input and thus we will get the largest number.
		int final_result = ((num3>temp_result)?num3:temp_result);
		System.out.println(final_result + " is the largest number.");
	}
}

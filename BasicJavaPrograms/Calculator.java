/* Four function calculator using command line arguments */

public class Calculator
{
	public static void main(String args[])
	{
		//The input will be provided in the format "number1 <operator> number2".
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[2]);
		
//equls is used to compare the contents as the String is not a data type, it is //class.
		if(args[1].equals("+"))
			System.out.println("Sum:"+(num1+num2));
		else if(args[1].equals("-"))
			System.out.println("Difference:"+(num1-num2));
		else if(args[1].equals("x"))
			System.out.println("Product:"+(num1*num2));
		else if(args[1].equals("/"))
			System.out.println("Quotient:"+(num1/num2));
		else
			System.out.println("Invalid operator detected.");
	}
}

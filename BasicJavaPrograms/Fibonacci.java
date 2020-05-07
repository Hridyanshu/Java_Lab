/* Write a program to print Fibonacci series using loop. */

public class Fibonacci
{
	public static void main(String args[])
	{
		int limit=Integer.parseInt(args[0]);
		int a=0,b=1,c;
		//The variables a and b are used as second last and third last terms of series.
		System.out.print(a+"\t"+b+"\t");
		for(int i=3;i<=limit;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+"\t");
		}
	}
}

/*Write a program to accept 10 student’s marks in an array, arrange it into ascending order, convert into the following grades and print marks and grades in the tabular form. 
Between 40 and 50 : PASS 
Between 51 and 75 : MERIT 
and above : DISTINCTION*/

public class ResultCalculation
{
	public static void main(String args[])
	{
		int arr[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					//Swapping
					arr[j]=arr[j]+arr[i];
					arr[i]=arr[j]-arr[i];
					arr[j]=arr[j]-arr[i];
				}
			}
		}
		System.out.println("\nThe final grades are:\n");
		System.out.println("MARKS" + "\t" + "GRADE");
		System.out.println("------------------");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=40&&arr[i]<=50)
				System.out.println(arr[i] + "\t" + "PASS");
			else if(arr[i]>=51&&arr[i]<=75)
				System.out.println(arr[i] + "\t" + "MERIT");
			else if(arr[i]>=76)
				System.out.println(arr[i] + "\t" + "DISTINCTION");
			else
				System.out.println(arr[i] + "\t" + "NA");
		}
	}
}

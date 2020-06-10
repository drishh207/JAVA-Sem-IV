import java.util.*;
import java.io.*;
class second_smallest_no
{
	public static void main(String []args)
	{
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of array elements: ");
		n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		Arrays.sort(arr);
		int small=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>small)
			{
				small=arr[i];
				break;
			}
		}
		System.out.println("The second smallest number is: "+small);
	}
}
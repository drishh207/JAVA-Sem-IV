import java.util.*;

public class duplicate
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int m,count=0;
		System.out.println("Enter number of array elements: ");
		m=scan.nextInt();
		int[] arr=new int[m];
		System.out.println("Enter array elements: ");
		for(int i=0;i<m;i++)
			arr[i]=scan.nextInt();
		
		Arrays.sort(arr);
		for(int j=0;j<(arr.length-1);j++)
		{
			if(arr[j]!=arr[j+1])
					count=count+1;
		}
		
		System.out.println("The new length of the array is "+(count+1));
	}
}
import java.util.*;

 public class peak
{
	public static void main(String args[])
	{
		int count=0,i=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements: ");
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
	
		System.out.println("The peak elements are:");
		i=1;
		for(int j=i;j<(arr.length-1);j++)
		{
			if(arr[j]>arr[j-1] && arr[j]>arr[j+1])
			{
				count=arr[j];
				
			}
			else if(arr[0]>arr[1])
			{
				count=arr[0];
			}
			else{
				count=arr[arr.length-1];
			}
		}
		System.out.print(" "+count);
		
	}
}
	
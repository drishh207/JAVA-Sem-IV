import java.util.*;

class difference
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	int m;
	System.out.println("Enter number of array elements: ");
	m=scan.nextInt();
	int[] arr=new int[m];
	System.out.println("Enter array elements: ");
	for(int i=0;i<m;i++)
		arr[i]=scan.nextInt();
	
	Arrays.sort(arr);
	int small=arr[0];
	
	int large=arr[(arr.length)-1];
	
	System.out.println("The difference between the smallest and the largest number in the array is: "+(large-small));
	}
}	
	
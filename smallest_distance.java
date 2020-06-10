import java.util.*;

public class smallest_distance
{
    static void smallestDistance(int [] array)
	{
		int smallest = Math.abs(array[0]-array[1]);
        int index = 0;
        for(int i=1; i<array.length-1; i++)
		{
            int value = Math.abs(array[i]-array[i+1]);
            if(value< smallest)
			{
            smallest= value;
            index = i;
			}
        }
		
		System.out.println("Smallest : "+smallest);
		System.out.println("Index: "+index);
	}
           
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter arraysize");
		int n=scan.nextInt();
        int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
        smallestDistance(arr);
    }
}

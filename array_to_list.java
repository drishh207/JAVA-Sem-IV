import java.util.*;
import java.io.*;
public class array_to_list
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>();
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		System.out.println("Enter elements to be added in the arraylist:");
		for(int i=0;i<=n;i++)
			arr.add(scan.nextLine());
		
		Object[] a = arr.toArray();
		System.out.println("The converted array is: "); 
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
		
		
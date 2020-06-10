import java.util.*;
import java.io.*;
class even_odd
{
	public static void main(String args[]) throws IOException
	{
	Scanner scan=new Scanner(System.in);
	int even[]=new int[10];
	int odd[]=new int[10];
	int c1=0,c2=0,n;
	System.out.println("Enter a number: ");
	String st=scan.nextLine();
	do
	{
		n=Integer.parseInt(st);
		if(n%2==0)
		{
			even[c1]=n;
			c1++;
		}
		else
		{
			odd[c2]=n;
			c2++;
		}
		System.out.println("Enter a number: ");
		st=scan.nextLine();
	}while(st.equals("end")==false);
	
	System.out.println("The even terms are:");
	for(int i=0;i<c1;i++)
	{
		System.out.println("\t"+even[i]);
	}
	
	System.out.println("The odd terms are:");
	for(int i=0;i<c2;i++)
	{
		System.out.println("\t"+odd[i]);
	}
	}
	
}
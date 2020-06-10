import java.util.*;
import java.io.*;
class fact
{
	public static void main(String args[]) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Console c=System.console();
		int fact=1;
		char ch;
		int arr=Integer.parseInt(args[0]); //calculating factorial using command line arguments
		for(int i=arr;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println("\nThe factorial of "+arr+" using command line arguments is "+fact);
		
		System.out.println("Enter \n 1 for input by scanner class \n 2 for input by bufferReader \n 3 for input by console \n 4 for DataInputStream");
		ch=scan.next().charAt(0);;
		switch(ch)
		{
			case '1':
					  System.out.println("Enter a number"); //calculating factorial using scanner class
					  int a=scan.nextInt();
					  int f=1;
					  for(int i=a;i>0;i--)
					  {
						f=f*i;
					  }
					  System.out.println("\nThe factorial of "+a+" using scanner class is "+f);
					  break;
			
			case '2': int f1=1;
					  System.out.println("Enter a number"); // calculating factorial using BufferdReader class
					  int b1=Integer.parseInt(br.readLine());
					  for(int i=b1;i>0;i--)
					  {
						f1=f1*i;
					  }
					  System.out.println("\nThe factorial of "+b1+" using BufferdReader is "+f1);
					  break;
					  
			case '3': int f2=1;
					  System.out.println("Enter a number");
					  int c1=Integer.parseInt(c.readLine());  // calculating factorial using console class
					  for(int i=c1;i>0;i--)
					  {
						f2=f2*i;
					  }
					  System.out.println("\nThe factorial of "+c1+" using console is "+fact);
					  break;
			
			case '4': int f3=1;
					  System.out.println("Enter a number");  //calculating factorial using DataInputStream class
					  DataInputStream din = new DataInputStream(new FileInputStream("F:\\text.txt"));
					  int d = din.readInt(); 
					  for(int i=d;i>0;i--)
					  {
						f3=f3*i;
					  }
					  System.out.println("\nThe factorial of "+d+" using DataInputStream is "+f3);
					  break;
	}
}
}
			
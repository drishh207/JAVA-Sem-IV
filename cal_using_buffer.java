import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class cal_using_buffer
{
	public static void main(String args[]) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		calculator obj=new calculator();
		System.out.println("Enter 1 for addition \n 2 for subtraction \n 3 for multipliation \n 4 for division \n 5 for square root \n 6 for power \n 7 for mean \n 8 for variance");
		System.out.println ("Enter your choice : ");
		char ch=scan.next().charAt(0);
		switch(ch)
		{
			case '1': obj.get_addition();
					break;
					
			case '2': obj.get_subtraction();
					break;
					
			case '3': obj.get_multiplication();
					break;
			
			case '4': obj.get_division();
					break;
					
			case '5': obj.get_square_root();
					break;
					
			case '6': obj.get_power();
					break;
					
			case '7': double m=obj.finding_mean();
					System.out.println ("Mean of the nos. is "+m);
			        break;
			
			case '8': obj.finding_variance();
					break;
					
			default: System.out.println("\nEnter valid value" );
		}
	}
}

class calculator
{
	public double mean;
	public static int l;
	public double arr[]=new double[100];
	Scanner scan=new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public double finding_mean() throws Exception
	{
		System.out.println ("Enter the no. then enter and end when all no. have been entered: \n");
		double num1 = 0;
		String s = "0";
		for(l=0;s.equals("end")==false;l++)
		{
			s=br.readLine();
					
			if (s.equals("end")==false)
			{
				double sum1 = Double.parseDouble(s);
				arr[l]=sum1;
				num1 = num1 + sum1;
				
			}
			else
			{
				mean = num1/l;
				System.out.println(l);
			}
		}
		return mean;
	}
	
	public void finding_variance() throws Exception
	{
		calculator obj=new calculator();
		
		double m=obj.finding_mean();
		double num1 = 0;
		double num2 = 0;
		double variance=0;
		double sum3=0,sum=0;
		String s = "0";
		for(int i=0;i<l-1;i++)
		{
			sum=arr[i]-m;
			double sum2 = sum*sum;
			sum3=sum3+sum2;
		}
			variance= sum3/(l-1);
			System.out.println ("Variance of the nos. is "+variance);

	}
	
	public void get_addition() throws Exception
	{
		System.out.println("Enter two numbers:  ");
		String a1=br.readLine();
		double a=Double.parseDouble(a1);
		String b1=br.readLine();
		double b=Double.parseDouble(b1);
		double sum=a+b;
		System.out.println("\nThe addition of "+a+" and "+b+" is "+sum+".");
	}
	
	public void get_subtraction() throws Exception
	{
		System.out.println("Enter two numbers:  ");
		String a1=br.readLine();
		double a=Double.parseDouble(a1);
		String b1=br.readLine();
		double b=Double.parseDouble(b1);
		double sub=a-b;
		System.out.println("\nThe subtraction of "+a+" and "+b+" is "+sub+".");
	}
	
	public void get_multiplication() throws Exception
	{
		System.out.println("Enter two numbers:  ");
		String a1=br.readLine();
		double a=Double.parseDouble(a1);
		String b1=br.readLine();
		double b=Double.parseDouble(b1);
		double mul=a*b;
		System.out.println("\nThe multiplication of "+a+" and "+b+" is "+mul+".");
	}
	
	public void get_division() 
	{
		try
		{
			System.out.println("Enter two numbers:  ");
			String a1=br.readLine();
			double a=Double.parseDouble(a1);
			String b1=br.readLine();
			double b=Double.parseDouble(b1);
			double div=a/b;
			System.out.println("\nThe division of "+a+" and "+b+" is "+div+".");
		}
		catch(Exception e)
		{
			System.out.println("\nPlease enter valid numbers");
		}
	}
	
	public void get_square_root() throws Exception
	{
		System.out.println("Enter a number: ");
		String a1=br.readLine();
		double a=Double.parseDouble(a1);
		double s=Math.sqrt(a);
		System.out.println("\nThe square root of "+a+" is "+s);
	}
	
	public void get_power() throws Exception
	{
		System.out.println("Enter number:  ");
	    String a1=br.readLine();
		double a=Double.parseDouble(a1);
		System.out.println("Enter exponent:  ");
		String b1=br.readLine();
		double b=Double.parseDouble(b1);
		double ex=Math.pow(a,b);
		System.out.println("\n "+a+" ^ "+b+" = "+ex);
	}
  
}
	
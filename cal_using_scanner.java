import java.util.Scanner;
import java.lang.*;
public class cal_using_scanner
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		calculator obj=new calculator();
		System.out.println("Enter 1 for addition \n 2 for subtraction \n 3 for multipliation \n 4 for division \n 5 for square root \n 6 for power \n 7 for mean \n 8 for variance");
		int ch=scan.nextInt();
		switch(ch)
		{
			case 1: obj.get_addition();
					break;
					
			case 2: obj.get_subtraction();
					break;
					
			case 3: obj.get_multiplication();
					break;
			
			case 4: obj.get_division();
					break;
					
			case 5: obj.get_square_root();
					break;
					
			case 6: obj.get_power();
					break;
					
			case 7: obj.finding_mean();
			        break;
			
			case 8: obj.finding_variance();
					break;
					
			default: System.out.println("\nEnter valid value");
		}
	}
}

class calculator
{
	public double mean;
	Scanner scan=new Scanner(System.in);
	
	public void finding_mean()
	{
		System.out.println ("Enter the no. then enter and end when all no. have been entered: \n");
		double num1 = 0;
		int l=0;
		String s = "0";
		while (s.equals("end")==false)
		{
			s=scan.nextLine();
					
			if (s.equals("end")==false)
			{
				double sum1 = Double.parseDouble(s);
				num1 = num1 + sum1;
				l++;
			}
			else
			{
				mean = num1/l;
				System.out.println ("Mean of the nos. is "+mean);
			}
		}
	}
	
	public void finding_variance()
	{
		System.out.println ("Enter the no. then enter and end when all no. have been entered: \n");
		double num1 = 0;
		double num2 = 0;
		double variance=0;
		double sum3=0;
		String s = "0";
		int i=0;
		while (s.equals("end")==false)
		{
			s=scan.nextLine();
					
			if (s.equals("end")==false)
			{
				double sum1 = Double.parseDouble(s);
				sum1=sum1-mean;
				double sum2 = sum1*sum1;
				sum3=sum3+sum2;
				i++;
			}
			else
			{
				variance= sum3/i;
				System.out.println ("Variance of the nos. is "+variance);
			}
		}
	}
	
	public void get_addition()
	{
		System.out.println("Enter two numbers:  ");
		double a=scan.nextInt();
		double b=scan.nextInt();
		double sum=a+b;
		System.out.println("\nThe addition of "+a+" and "+b+" is "+sum+".");
	}
	
	public void get_subtraction()
	{
		System.out.println("Enter two numbers:  ");
		double a=scan.nextInt();
		double b=scan.nextInt();
		double sub=a-b;
		System.out.println("\nThe subtraction of "+a+" and "+b+" is "+sub+".");
	}
	
	public void get_multiplication()
	{
		System.out.println("Enter two numbers:  ");
		double a=scan.nextInt();
		double b=scan.nextInt();
		double mul=a*b;
		System.out.println("\nThe multiplication of "+a+" and "+b+" is "+mul+".");
	}
	
	public void get_division()
	{
		try
		{
			System.out.println("Enter two numbers:  ");
			double a=scan.nextInt();
			double b=scan.nextInt();
			double div=a/b;
			System.out.println("\nThe division of "+a+" and "+b+" is "+div+".");
		}
		catch(Exception e)
		{
			System.out.println("\nPlease enter valid numbers");
		}
	}
	
	public void get_square_root()
	{
		System.out.println("Enter a number: ");
		double a=scan.nextDouble();
		double s=Math.sqrt(a);
		System.out.println("\nThe square root of "+a+" is "+s);
	}
	
	public void get_power()
	{
		System.out.println("Enter number:  ");
		double a=scan.nextDouble();
		System.out.println("Enter exponent:  ");
		double b=scan.nextDouble();
		double ex=Math.pow(a,b);
		System.out.println("\n "+a+" ^ "+b+" = "+ex);
	}
	
}
	
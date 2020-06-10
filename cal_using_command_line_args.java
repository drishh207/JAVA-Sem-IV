import java.util.*;
class cal_using_command_line_args
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1 for addition \n 2 for subtraction \n 3 for multipliation \n 4 for division \n 5 for square root \n 6 for power \n 7 for mean \n 8 for variance");
		int ch=scan.nextInt();
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double mean=0;
		switch(ch)
		{
			case 1: System.out.println("\nAdditionAddition of "+a+" and "+b+" is "+(a+b));
					break;
					
			case 2: System.out.println("\nDivisionDivisionSubtraction of "+a+" and "+b+" is "+(a-b));
					break;
					
			case 3: System.out.println("\nDivisionDivisionMultiplication of "+a+" and "+b+" is "+(a*b));
					break;
			
			case 4: System.out.println("\nDivision of "+a+" and "+b+" is "+(a/b));
					break;
					
			case 5: System.out.println("\nEnter Square root of "+a+" is "+(Math.sqrt(a)));
					break;
					
			case 6: System.out.println("\n "+a+" ^ "+b+" = "+(Math.pow(a,b)));
					break;
					
			case 7: double sum=0;
					for(int i=0;i<args.length;i++)
					{
						double n=Double.parseDouble(args[i]);
						sum=sum+n;
					}
					mean=sum/(args.length);
					System.out.println ("The mean of numbers entered is "+mean);
					break;
			
			case 8: double sum3=0,sum1=0;
					for(int i=0;i<args.length;i++)
					{
						double n1=Double.parseDouble(args[i]);
						sum1=sum1+n1;
					}
					mean=sum1/(args.length);
					for(int i=0;i<args.length;i++)
					{
						double n=Double.parseDouble(args[i]);
						double s=n-mean;
						double sum2=s*s;
						sum3=sum3+sum2;
					}
					double variance=sum3/(args.length);
					System.out.println ("The variance of numbers entered is "+variance);
					break;
					
			default: System.out.println("\nEnter valid value");
		}
	}
}


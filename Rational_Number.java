import java.util.*;
import java.io.*;


public class Rational_Number {
    
    public static void main(String[] args) {
	
	try{
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
		
		Scanner sc=new Scanner(System.in);
        

            System.out.println("MENU");
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Compare\n6.Floating point equivalent\n7.Absolute value");
            System.out.println("Enter choice : ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1 : int res=num1+num2;
                         System.out.println("Result : "+res);
                         break;
                    
                case 2 : int res1=num1-num2;
                         System.out.println("Result : "+res1);
                         break;
                    
                case 3 : int res2=num1*num2;
                         System.out.println("Result : "+res2);
                         break;
                    
                case 4 : double res3=num1/num2;
                         System.out.println("Result : "+res3);
                         break;
                    
                case 5 : if(num1>num2)
                            System.out.println(num1+" is greater");
                         else
                            System.out.println(num2+" is greater");
                         break;
                    
                case 6 : double n1=num1;
                         double n2=num2;
                         System.out.println("Floating point equivalent of "+num1+" and "+num2+" : "+n1+n2);
                         break;
                    
                case 7 : System.out.println("Absolute value of "+num1+" : "+Math.abs(num1));
                         System.out.println("Absolute value of "+num1+" : "+Math.abs(num2));
                         break;
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Error encoutered");
        }
        
        finally
        {
            System.out.println("Program Execution completed");
        }
      
    }
}
    
    
    


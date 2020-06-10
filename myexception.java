import java.util.*;
import java.io.*;
import java.lang.*;

public class myexception extends Exception {

    myexception()
    {
        
    }
    myexception(String s)
    {
        super(s);
    }
	
	static void factorial(int n)
	{
		int fact=1;
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+n+" is "+fact);
	}
	
	//@Override
	//public String toString()
	//{
	//	return "hbdwhb";
//}
   
    public static void main(String[] args) {
        
       try{
            
            for(int i=0;i<args.length;i++)
			{
				int n=0;
				try{
				n=Integer.parseInt(args[i]);
				}
				
				catch(NumberFormatException ne)
				{
					myexception me1=new myexception("INVALID FORMAT");
					throw me1;
				}
				
				if(n>0 && n<12)
				{
					factorial(n);
				}
				else
				{
					myexception me=new myexception("OUT OF RANGE");
					throw me;
				}
			}
	   }  
            
       catch(myexception me)
       {
		   System.out.println("Error encountered");
           me.printStackTrace();
		   System.out.println(me.toString());   
       }
       
	   finally
	   {
		   System.out.println("Program Execution completed");
	   }
    
}

}

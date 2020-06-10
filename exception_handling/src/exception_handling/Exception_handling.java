package exception_handling;

import java.io.*;

public class Exception_handling {

    void demo()
    {
        //Using the try-catch clause 
        //If any error occurs in try block(here DivideByZero Error is encountered) 
        //so the catch is executed not haulting the execution of the program
        int a=10,b=0;
        try
        {
            int result=a/b;
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        //The finally block will always be executed in any condition.
        finally
        {
            System.out.println("Program Ended");
        }
    }
    
    void demo1()
    {
        //here throw clause is used to an exception explicitly and then catch it.
        try
        {
            System.out.println("Trying throw clause");
            throw new NullPointerException("Exception Occured");
        }
        catch(NullPointerException ne)
        {
            System.out.println(ne);
        }
        
    }
    
    void accept() throws IOException
    {
        //here throws clause to handle checked exception else it is a compilation error.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name=br.readLine();
        System.out.println("Name:"+name);
    }
    
    
    
    public static void main(String[] args) throws IOException
    {
        Exception_handling obj=new Exception_handling();
        obj.accept();
        obj.demo1();
        obj.demo();
        
    }
    
}

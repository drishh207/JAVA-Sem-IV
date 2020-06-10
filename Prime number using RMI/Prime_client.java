import java.io.*;
import java.rmi.*;
import java.net.*;
public class Prime_client {
    
     public static void main(String args[])
    {
        try
        {
            String url="rmi://127.0.0.1/RmiPrime";
            Prime p=(Prime)Naming.lookup(url);

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter No : ");
            int no=Integer.parseInt(br.readLine());
            int x=p.check_prime(no);
            if(x==0)
            System.out.println(""+no+" is a prime number");
            else
            System.out.println(""+no+" is not a prime number");   
    }
        catch(Exception ex){}
    }
}

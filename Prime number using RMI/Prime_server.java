import java.rmi.*;
import java.net.*;

public class Prime_server {

    public static void main(String args[])
    {
        try
        {
        	PRIMENUMBER n=new PRIMENUMBER();
        	Naming.rebind("RmiPrime",n);
        }
        catch(Exception ex){}
    }

    
}

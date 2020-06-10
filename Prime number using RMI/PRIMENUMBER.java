import java.rmi.*;
import java.rmi.server.*;

public class PRIMENUMBER extends UnicastRemoteObject implements Prime
{
    public PRIMENUMBER() throws Exception
    {
        super();
    }

    public int check_prime(int n) throws RemoteException
    {
        int i,count=0;
        for(i=2;i<=n/2;i++)
            if(n%i==0)
            {
                count++;
                break;
            }       
            return count;
    }
}

import java.rmi.*;

public interface Prime extends Remote
{
    public int check_prime(int num) throws RemoteException;
}

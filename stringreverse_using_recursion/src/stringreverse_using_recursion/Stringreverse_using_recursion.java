package stringreverse_using_recursion;
import java.io.*;
import java.util.*;

public class Stringreverse_using_recursion 
{
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String: ");
        String s=br.readLine();
        reverse r=new reverse();
        r.reversed(s);
    }
    
}

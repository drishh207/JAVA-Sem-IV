package stringreverse_using_recursion;
import java.io.*;
import java.util.*;

public class reverse 
{
    void reversed(String s)
    {
        if ((s==null)||(s.length() <= 1)) 
           System.out.println(s); 
        else
        { 
            System.out.print(s.charAt(s.length()-1)); 
            reversed(s.substring(0,s.length()-1)); 
        } 
    }
    
}

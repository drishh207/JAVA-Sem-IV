package stringreverse_using_tokenizer;
import java.util.*;
import java.io.*;


public class Stringreverse_using_tokenizer {

    public static void main(String[] args) 
    {
        StringBuffer sb=new StringBuffer();
        String s="Monday,Tuesday,Wednesday,Thursday,Friday,saturday,Sunday";
        System.out.println("Original String: "+s);
        StringTokenizer st=new StringTokenizer(s,",");
        System.out.println("Reversed String:");
        while(st.hasMoreTokens())
        {
            String str=(String)st.nextToken();
            for(int j=str.length()-1;j>=0;j--)
            {
                sb.append(str.charAt(j));
            }
            System.out.print(" "+sb);
            sb.delete(0,str.length());
        }
    }
    
}
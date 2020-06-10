package string_operations_userdefined;

import java.io.*;
import java.util.*;

public class operations 
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb=new StringBuffer();
    void copy(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            sb.append(s.charAt(i));
        }
        System.out.println("Original String: "+s);
        System.out.println("Copied String: "+sb);
    }
    
    void concat(String s) throws IOException
    {
        System.out.println("Enter new string to be concatenated");
        String n=br.readLine();
        System.out.println("The concatenated string is "+(s+n));
    }
    
    void length(String s)
    {
        int i=0;
        char[] arr=s.toCharArray();
        for(char c:arr)
            i++;
        System.out.println("The length of "+s+" is "+i);
    }
    
    void reverse(String s)
    {
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        System.out.println("Original String: "+s);
        System.out.println("Reversed String: "+sb);
    }
    
    void palindrome(String s)
    {
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        
        if(s.equals(sb.toString()))
            System.out.println(""+s+" is a plaindrome");
        else
            System.out.println(""+s+" is not a plaindrome");
    }
    
    void compare(String s) throws IOException
    {
        int count=0,i=0;
        System.out.println("Enter a new String to be compared: ");
        String n=br.readLine();
        int l=s.length();
        for(i=0;i<n.length();i++)
        {
            if(s.charAt(i)==n.charAt(i))
                count++;
            else
                break;
        }
        if(count==l)
            System.out.println("The Strings are equal");
        else
            System.out.println("The strings are not equal");
    }
    
    void substring(String s) throws IOException
    {
        StringBuffer sb=new StringBuffer();
        char[] a;
        int count=0,count1=0,j=0;
        System.out.println("Enter a substring to find in main string: ");
        String n=br.readLine();
        char[] b=n.toCharArray();
        String[] arr=s.split(" ");
        
        for(String str:arr)
        {
            a=str.toCharArray();
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==b[j])
                {
                     count++;
                     j++;
                }
                if(count==b.length)
                {
                    count1++;
                    count=0;
                    j=0;
                }
            }
        }
        if(count1==0)
            System.out.println("Substring not found");
        else
            System.out.println("The "+n+" substring occured "+count1+" times in "+s);
        
    }
    
}

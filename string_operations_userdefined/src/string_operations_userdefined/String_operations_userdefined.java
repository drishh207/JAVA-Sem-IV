package string_operations_userdefined;

import java.util.*;
import java.io.*;

public class String_operations_userdefined {

    public static void main(String[] args) throws IOException
    {
        char ch='y';
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner scan=new Scanner(System.in);
        System.out.println("USER DEFINED STRING OPERATIONS");
        System.out.println("Enter a String: ");
        String s=br.readLine();
        while(ch!='n'||ch!='N')
        {
            System.out.println("Enter \n 1. COPYING STRING \n 2. CONCATENATING STRING \n 3. LENGTH OF STRING \n 4. REVERSING STRING");
            System.out.println(" 5. CHECKING PALINDROME \n 6. STRING COMPARE \n 7. OCCURENCE OF SUBSTRING");
            int c=scan.nextInt();
            operations obj=new operations();
            switch(c)
            {
                case 1: obj.copy(s);
                    break;
                
                case 2: obj.concat(s);
                    break;
                
                case 3: obj.length(s);
                    break;
                
                case 4: obj.reverse(s);
                    break;
                  
                case 5: obj.palindrome(s);
                    break;
                
                case 6: obj.compare(s);
                    break;
                
                case 7: obj.substring(s);
                    break;
            }
            System.out.println("Do you want to continue(Y/N)");
            ch=scan.next().charAt(0);
            if(ch=='n'||ch=='N')
                System.exit(0);
        }
        
    }
}

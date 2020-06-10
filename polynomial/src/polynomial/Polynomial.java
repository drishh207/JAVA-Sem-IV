package polynomial;
import java.util.*;
import java.io.*;

public class Polynomial extends polylist
{
    public static void main(String[] args)
    {
        char ch='y';
        Scanner scan=new Scanner(System.in);
        LinkedList<polynode> l=new LinkedList<>();
        while(ch=='y'||ch=='Y')
        {
            System.out.println("Enter \n 1. CREATE POLYNOMIAL \n 2. PRINT POLYNOMIAL \n 3. ADDITION OF POLYNOMIAL \n 4. MULTIPLICATION OF POLYNOMIAL");
            int n=scan.nextInt();
            polylist p=new polylist();
            switch(n)
            {
                case 1: char c='u'; 
                        while(c!='n'||c!='N')
                        {
                            l=p.create();
                            System.out.println("Add more?");
                            c=scan.next().charAt(0);
                            if(c=='n'||c=='n')
                                break;
                        }
                    break;
                
                case 2: p.print(l);
                    break;
                
                case 3: p.addition();
                    break;
                
                case 4: p.multiplication();
                    break;
            }
            System.out.println("\nDo you want to continue(Y/N)");
            ch=scan.next().charAt(0);
        }
        System.exit(0);
    }
    
}

package polynomial;
import java.util.*;
import java.io.*;

public class polylist extends polynode
{
    Scanner scan=new Scanner(System.in);
    LinkedList<polynode> l=new LinkedList<>();
    LinkedList<polynode> create()
    {
        System.out.println("Enter coefficient:");
        double c=scan.nextDouble();
        System.out.println("Enter exponent:");
        int e=scan.nextInt();
        l.add(new polynode(c,e));
        return l;
        
    }
    
    void print(LinkedList<polynode> l)
    {
        Iterator itr=l.iterator();
        while(itr.hasNext())
        {
            polynode p=new polynode();
            p=(polynode)itr.next();
            System.out.print(" "+p.coef+"x^"+p.exp+" + ");
        }
    }
    
    void addition()
    {
        LinkedList<polynode> l1=new LinkedList<>();
        LinkedList<polynode> l2=new LinkedList<>();
        LinkedList<polynode> res=new LinkedList<>();
        polylist p1=new polylist();
        polylist p2=new polylist();
        char c='u';
        System.out.println("First polynomial");
        while(c!='n'||c!='N')
        {
             l1=p1.create();
             System.out.println("Add more?");
             c=scan.next().charAt(0);
             if(c=='n'||c=='N')
             break;
        }
        System.out.println("Second Polynomial");
        while(c!='n'||c!='N')
        {
             l2=p2.create();
             System.out.println("Add more?");
             c=scan.next().charAt(0);
             if(c=='n'||c=='N')
             break;
        }
        int i=0,j=0;
        System.out.println("The addition is ");
        while(i<l1.size() && j<l2.size())
        {
            if(l1.get(i).exp==l2.get(j).exp)
            {
                double co=l1.get(i).coef+l2.get(j).coef;
                int e=l1.get(i).exp;
                res.add(new polynode(co,e));
                i++;
                j++;
            }
            else if(l1.get(i).exp>l2.get(j).exp)
            {
                double co=l1.get(i).coef;
                int e=l1.get(i).exp;
                res.add(new polynode(co,e));
                i++;
            }
            
            else
            {
                double co=l2.get(j).coef;
                int e=l2.get(j).exp;
                res.add(new polynode(co,e));
                j++;
            }
        }
        while(i<l1.size())
        {
            double co=l1.get(i).coef;
            int e=l1.get(i).exp;
            res.add(new polynode(co,e));
            i++;
        }
        
        while(j<l2.size())
        {
            double co=l2.get(j).coef;
            int e=l2.get(j).exp;
            res.add(new polynode(co,e));
            j++;
        }
        print(res);
    }
    
    void multiplication()
    {
        LinkedList<polynode> a=new LinkedList<>();
        LinkedList<polynode> b=new LinkedList<>();
        LinkedList<polynode> res1=new LinkedList<>();
        polylist p1=new polylist();
        polylist p2=new polylist();
        System.out.println("Multiplication of 2 Polynomials");
        
       
        int n=1,k=1;
        char c='u';
        System.out.println("First polynomial");
        while(c!='n'||c!='N')
        {
             a=p1.create();
             System.out.println("Add more?");
             c=scan.next().charAt(0);
             if(c=='n'||c=='N')
             break;
        }
        c='y';
        System.out.println("Second Polynomial");
        while(c!='n'||c!='N')
        {
             b=p2.create();
             System.out.println("Add more?");
             c=scan.next().charAt(0);
             if(c=='n'||c=='N')
             break;
        }
        int i=0,j=0;
        while(i<a.size())
        {
            j=0;
            while(j<b.size())
            {
                res1.add(new polynode((a.get(i).coef*b.get(j).coef),(a.get(i).exp+b.get(j).exp)));
                j++;
            }
            i++;
        }
       
        int r,o;
        for(r=0;r<res1.size()-1;r++){
            for(o=r+1;o<res1.size();o++){
                if(res1.get(r).exp==res1.get(o).exp){
                    polynode p=new polynode();
                    p.coef=res1.get(r).coef+res1.get(o).coef;
                    p.exp=res1.get(r).exp;
                    res1.set(r, p);
                    res1.remove(o);
                }
            }
      }
      print(res1);  
   }
}

import java.util.Scanner;
class as1c
{
int gc(int a, int b)
{
int c;
if(b==0)
{
return a;
}
else
{
return gc(b,a%b);
}
}
public static void main(String ar[])
{
Gcd g=new Gcd();
Scanner sc=new Scanner(System.in);
int a,b,t;
System.out.println("\nEnter first number:");
a=sc.nextInt();
System.out.println("\nEnter second number:");
b=sc.nextInt();
if(a<b)
{
t=a;
a=b;
b=t;
}
System.out.println("\nGCD is:"+g.gc(a,b));
}
}


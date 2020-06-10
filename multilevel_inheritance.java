class A
{
	int a=10;
	void  display()
	{
		System.out.println("Parent Class A");
	}
}

class B extends A
{
	int b=20;
	void  show()
	{
		System.out.println("Parent Class B");
	}
}

class C extends B
{
	int c=30;
	void  disp()
	{
		System.out.println("Child Class C");
	}
}

public class multilevel_inheritance
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.disp();
		System.out.println("Value of C is "+obj.c);
		obj.show();
		System.out.println("Value of B is "+obj.b);
		obj.display();
		System.out.println("Value of A is "+obj.a);
	} 
}
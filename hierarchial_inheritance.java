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

public class hierarchial_inheritance extends A
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.display();
		System.out.println("Value of A is "+obj.a);
		hierarchial_inheritance obj1=new hierarchial_inheritance();
		obj1.display();
		System.out.println("Value of A is "+obj1.a);
	} 
}
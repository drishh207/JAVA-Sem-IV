import java.util.*;

public class array_list_op
{
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(4);
		al.add(45);
		al.add(13);
		al.add(44);
		al.add(99);
		
		//for(int a:al)
			System.out.println("  "+al);
		System.out.print("The length of arraylist is "+al.size());
		
		al.remove(new Integer(4));
		al.remove(new Integer(44));
		//for(int a:al)
			System.out.println("  "+al);
		
		al.add(0,45);
		//for(int a:al)
			System.out.println("  "+al);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1=(ArrayList<Integer>)al.clone();
		//for(int a:al1)
			System.out.println("  "+al1);
		
		Vector vector = new Vector();
		vector.add(120);
		vector.add(130);
		al.addAll(1,vector);
		//for(int a:al)
			System.out.println("  "+al);
		
		al.remove(3);
		//for(int a:al)
			System.out.println("  "+al);
		
		System.out.println("The sublist is "+al.subList(2,4));
		
		System.out.println("The index of is "+al.indexOf(45));
		
		System.out.println("The element at index 3 is "+al.get(3));
		
		if(al.contains(33))
			System.out.println("The element exists in the arraylist");
		else
			System.out.println("The element exists in the arraylist");
		
		al.set(3,100);
		//for(int a:al)
			System.out.print("  "+al);
		
		if(al.contains(33))
			System.out.println("The element exists in the arraylist");
		else
			System.out.println("The element exists in the arraylist");
	}
}
		
		
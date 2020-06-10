import java.util.*;

public class remove_ele
{
	public static void main(String args[])
	{
		int count=0;
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		a1.add(0);
		a1.add(9);
		a1.add(4);
		a1.add(0);
		a1.add(8);
		
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			int i=(Integer)itr.next();
			if(i==0)
			{
				itr.remove();
				a2.add(i);
			}
		}
		
		a1.addAll(a2);
		System.out.println(" "+a1);
	}
}
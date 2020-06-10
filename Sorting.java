//W.a.p which performs sorting of group of integer values using bubble sort &amp; Quick Sort Use Array List.
import java.util.*;
import java.io.*;

class Sorting
{
	static void bubb(ArrayList<Integer> a)
	{
		int t;
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
			//	System.out.println("i="+a.get(i)+"j="+a.get(j));
				if(a.get(i).compareTo(a.get(j))>0)
				{
					//System.out.println("i="+a.get(i)+"j="+a.get(j));
					t=a.get(i);
					a.set(i,a.get(j));
					a.set(j,t);
				}
			}
		}
		System.out.println(a);
	}
	
	static void quicksort(ArrayList<Integer> a, int l, int h)
	{
		if(l<h)
		{
			int pi=partition(a,l,h);
			
			quicksort(a,l,pi-1);
			quicksort(a,pi+1,h);
		}
	}
	static int partition(ArrayList<Integer> a, int l, int h)
	{
		int pivot=a.get(h);
		
		int i = l-1;
		int t;
		
		for(int j=l; j<h; j++)
		{
			if(a.get(j).compareTo(pivot)<=0)
			{
				i++;
				t=a.get(i);
				a.set(i,a.get(j));
				a.set(j,t);
			}
		}
		int to=a.get(i+1);
		a.set(i+1,a.get(h));
		a.set(h,to);
		return (i+1);
	}
	
	
	
	public static void main(String[] args)
	{
		int i,k;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter no. of elements in arraylist:");
		i=sc.nextInt();
		
		ArrayList<Integer> arly= new ArrayList<Integer>(i);
		
		System.out.println("\nEnter elements in arraylist:");
		
		for(int j=1;j<=i;j++)
		{
			k=sc.nextInt();
			arly.add(k);
		}
		System.out.println("\nBy BubbleSort:");
		bubb(arly);
		System.out.println("\nBy QuickSort method");
		quicksort(arly,0,arly.size()-1);
		System.out.println(arly);
	}
}
import java.util.*;

public class common
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int i=0,j=0,k=0,m,n,p;
		
		System.out.println("Array 1:");
		System.out.println("Enter number of array elements: ");
		n=scan.nextInt();
		int[] ar1=new int[n];
		System.out.println("Enter array elements: ");
		for(i=0;i<n;i++)
			ar1[i]=scan.nextInt();
		
		System.out.println("Array 2:");
		System.out.println("Enter number of array elements: ");
		m=scan.nextInt();
		int[] ar2=new int[m];
		System.out.println("Enter array elements: ");
		for(j=0;j<m;j++)
			ar2[j]=scan.nextInt();
		
		System.out.println("Array 3:");
		System.out.println("Enter number of array elements: ");
		p=scan.nextInt();
		int[] ar3=new int[p];
		System.out.println("Enter array elements: ");
		for(k=0;k<p;k++)
			ar3[k]=scan.nextInt();
		i=j=k=0;
		System.out.println("Common elements are "); 
		while (i < ar1.length && j < ar2.length && k < ar3.length) 
        { 
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k])    // If x = y and y = z, print any of them and move ahead in all arrays 
            {   System.out.print(ar1[i]+" ");   
				i++; 
				j++;
				k++;
			} 
  
            else if (ar1[i] < ar2[j])     // x < y 
                 i++; 
  
             
            else if (ar2[j] < ar3[k])     // y < z 
                 j++; 
  
             
            else                        // When x > y and z < y, i.e., z is smallest 
                 k++; 
        } 
	}
}
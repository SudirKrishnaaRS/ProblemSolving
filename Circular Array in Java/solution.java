//Circular array

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size of array: ");
	    int n=sc.nextInt();
	
	    int arr[]=new int[n];
	    System.out.println("Enter array elements: ");
	    for(int i=0;i<n;i++)
	        arr[i]=sc.nextInt();
	        
	    System.out.println("Enter Start index: ");    
	    int start_ind=sc.nextInt();
	    
	    for(int i=start_ind;i<n+start_ind;i++)
	    {
		    System.out.print(arr[i%n]+" ");
	    }
	    
	}
}


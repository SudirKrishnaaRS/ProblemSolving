// github.com/SudirKrishnaaRS

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[n];
		
		for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		   
		int c=0;
		for(int i=0;i<n-1;i++)
		{
		    if(arr[i+1]>arr[i])
		    {
		        c++;
		        brr[i]=c;
		    }
		    else
		    { 
		        c=0;
		        brr[i]=c;
		    }
		}
		
		Arrays.sort(brr);
		System.out.println(brr[n-1]);
	}
}

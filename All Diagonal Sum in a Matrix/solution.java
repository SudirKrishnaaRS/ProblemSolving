// All Diagonal Sum in a Matrix - Left Diagonal,Right Diagonal 

// github.com/SudirKrishnaaRS

import java.util.*;
public class Hello {

    public static void main(String[] args)
    {
		//Your Code Here
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		}
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i==j ||  ( (i+j)==(n-1) ) )
		        {
		            sum+=arr[i][j];
		        }
		      
		    }
		}
		
		System.out.println(sum);

	}
}

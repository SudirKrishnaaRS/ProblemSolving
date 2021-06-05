//Largest and Smallest Digits Difference

// github.com/SudirKrishnaaRS

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        String num=Integer.toString(n);
        int len=num.length();
        
        int arr[]=new int[len];
        int a=0;
        
        while(n!=0)
        {
            int rem=n%10;
            arr[a]=rem;
            a++;
            n=n/10;
            
        }
        
        Arrays.sort(arr);
        
        int res=arr[a-1]-arr[0];
        System.out.println(res);
        
	}
}

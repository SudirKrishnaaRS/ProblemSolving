//Sudir Krishnaa RS
//LinkedIn: https://www.linkedin.com/in/sudirkrishnaars/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
	//Your Code Here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String arr[]=new String[n];
    String sub_arr[]=new String[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.next();
        sub_arr[i]=arr[i].substring(1,arr[i].length()-1);
    }  
    int k=sc.nextInt();
    int j=0;

    for(int i=0;i<n;i++)
    {
        int ind=(i+k)%n; // to make array circular
        
        if(ind>=n)
        {
            ind=ind-n;
        }
        System.out.println(arr[i].charAt(0)+sub_arr[ind]+arr[i].charAt(arr[i].length()-1) );
    }

    
	}
}

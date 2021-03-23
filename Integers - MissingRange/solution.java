
//Sudir Krishnaa RS
//LinkedIn: https://www.linkedin.com/in/sudirkrishnaars/

Question:
![image](https://user-images.githubusercontent.com/67383465/112133810-1411f600-8bf2-11eb-818d-01236c240200.png)

 

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n]; 
    
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        
    int cnt=0,fl=0;
    if(arr[0]!=1)
    {
        System.out.print("1"+"-"+(arr[0]-1)+" ");
        fl=1;
    }
    for(int i=0;i<n-1;i++)
    {
        if(arr[i+1]-arr[i]==1)
        {
            cnt++;
            continue;
        }
        else
        {
          String S="";
          int diff=arr[i+1]-arr[i];
          for(int j=1;j<diff;j++)
          {
            int ele=arr[i]+j;
            S=S+" "+ele;  
          }
          String res[]=S.split(" ");
          System.out.print(res[1]+"-"+res[res.length-1]+" ");
                
        }
    }
      
      if((cnt+1)==n && fl==0)
      {
          System.out.print("-1");
      }
        
	}
}

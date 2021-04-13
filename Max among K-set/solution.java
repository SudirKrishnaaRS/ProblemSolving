// github.com/SudirKrishnaaRS

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n+1];
    for(int i=1;i<=n;i++)
        arr[i]=sc.nextInt();
        
    int k=sc.nextInt();
    int flag=0;
    
    for(int i=1;i<=n;i++)
    {
        flag=0;
        if(i<=n)
        {
            flag=0;
            int initial=i;
            int end=i+(k-1);
            if(end<=n)
            {
                i=i+(k-1);
                int max=0;
                for(int j=initial;j<=i;j++)
                {
                    if(arr[j]>max)
                        max=arr[j];
                }
                System.out.print(max+" ");
            }
            else
            {
                flag=1;
                break;
            }
        }
        else
        {
            break;
        }
        
        if(flag==1)
        {
            break;
        }
        
    }
    
	}
}

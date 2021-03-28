
//Sudir Krishnaa RS
//LinkedIn: https://www.linkedin.com/in/sudirkrishnaars/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[][]=new int[n][2];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<2;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    
    // swap if 'a' cordinate is grater than 'c'
    if(a>c)
    {
        int temp=a;
        a=c;
        c=temp;
    }
    // swap if 'b' cordinate is grater than 'd'
    if(b>d)
    {
        int temp=b;
        b=d;
        d=temp;
    }
    
    int cnt=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i][0]>=a && arr[i][0]<=c && 
            arr[i][1]>=b&& arr[i][1]<=d)
        {
            cnt++;
        }
    }
    
    System.out.print(cnt);
    
	}
}

// You are using Java
import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        
        int r=0,s=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int ele=sc.nextInt();
                arr[i][j]=ele;
                if(ele==0)
                    r++;
                else
                    s++;
            }
        }
        System.out.println(r+"\n"+s);
    }
}

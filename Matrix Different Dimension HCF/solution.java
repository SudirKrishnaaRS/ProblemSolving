//github.com/SudirKrishnaaRS

import java.util.*;
public class Hello {

    public static int findHCF(int a,int b)
    {
        int hcf=1;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        
        return hcf;
    }

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int ar1[][]=new int[m][n];
    
    for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            ar1[i][j]=sc.nextInt();
    
    int r=sc.nextInt();
    int c=sc.nextInt();
    int ar2[][]=new int[r][c];
    
    for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
            ar2[i][j]=sc.nextInt();
     
    int res_r=0;
    int res_c=0;
    if(m==r && n==c)
    {
        res_r=m;
        res_c=n;
    }
    else if(m>r && n>c)
    {
        res_r=r;
        res_c=c;
    }
    else if(m<r && n<c) 
    {
        res_r=m;
        res_c=n;
        
    }
    else if(m<r && n>c)
    {
        res_r=m;
        res_c=c;
    }
    else if(m>r && n<c)
    {
        res_r=r;
        res_c=n;
    }
    
    for(int i=0;i<res_r;i++)
    {
        for(int j=0;j<res_c;j++)
        {
            int res=findHCF(ar1[i][j],ar2[i][j]);
            System.out.print(res+" ");
        }
        System.out.print("\n");
    }
            
    
	}
}

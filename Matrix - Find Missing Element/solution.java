//github.com/SudirKrishnaaRS

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int R=sc.nextInt();
    int C=sc.nextInt();
    
    int res_r=0,res_c=0;
    String m="M";
    String s[][]=new String[R][C];
    int arr[][]=new int[R][C];
    
    for(int i=0;i<R;i++)
    {
        for(int j=0;j<C;j++)
        {
            String a=sc.next();
            s[i][j]=a;
            if(a.equals(m))
            {
                arr[i][j]=-1; // replace M as -1
            }
            else
            {
                arr[i][j]=Integer.parseInt(a);
            }
        }
    }
    
    int sum=sc.nextInt();
    
    //transpose the matrix
    int r=C;
    int c=R;
    int res[][]=new int[r][c];
    for(int i=0;i<R;i++)
        for(int j=0;j<C;j++)
            res[j][i]=arr[i][j];
    
    // replacing M with missing value
    int missing_res=0;
    int tot=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(res[i][j]==-1)
            {
                for(int k=0;k<c;k++)
                {
                    if(res[i][k]!=-1)
                    {
                        tot+=res[i][k];
                    }
                }
                
                missing_res=sum-tot;
                res[i][j]=missing_res;
            }
        }
    }
    
    // re-transpose the matrix
    int ar[][]=new int[R][C];
    for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
            ar[j][i]=res[i][j];

    // Display
    for(int i=0;i<R;i++)
    {
        for(int j=0;j<C;j++)
        {
            System.out.print(ar[i][j]+" ");
        }
        System.out.print("\n");
    }
    
	}
}

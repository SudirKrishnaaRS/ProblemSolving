// github.com/SudirKrishnaaRS

import java.util.*;
public class Hello {
    public static long rev_num(long num)
    {
        String s=String.valueOf(num);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String res=sb.toString();
        long rev_number=Long.parseLong(res);
        return rev_number;
    }

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==1)
    {
        System.out.print(0);
    }
    else if(n==2)
    {
        System.out.print(0+" "+1);
    }
    else
    {
        long a=0;
        long b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
            long c=rev_num(a)+rev_num(b);
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    
	}
}

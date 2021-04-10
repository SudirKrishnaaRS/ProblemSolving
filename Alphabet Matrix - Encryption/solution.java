//github.com/SudirKrishnaaRS

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
	Scanner sc=new Scanner(System.in);
    String s[][]=new String[5][5];
    
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            s[i][j]=sc.next();
        }
    }
    sc.nextLine();
    String ques=sc.nextLine();
    char ques_arr[]=ques.toCharArray();
    
    int var1=0;
    int var2=0;
    char v1='a';
    char v2='a';
    char s_arr[][]=new char[5][5];
    
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            String ele=s[i][j];
            if(ele.contains("/"))
            {
                var1=i;
                var2=j;
                v1=ele.charAt(0);
                v2=ele.charAt(2);
                s_arr[i][j]='*';
            }
            else
            {
                s_arr[i][j]=ele.charAt(0);
            }
        }
    }
    for(int k=0;k<ques_arr.length;k++)
    {
        char q=ques_arr[k];
        if(q==' ')
        {
            System.out.print(" ");
        }
        else
        {
            int flag=0;
            for(int i=0;i<5;i++)
            {
                flag=0;
                for(int j=0;j<5;j++)
                {
                    if(q==s_arr[i][j])
                    {
                        String a=String.valueOf(i+1);
                        String b=String.valueOf(j+1);
                        System.out.print(a+b);
                        flag=1;
                        break;
                    }
                    else if(q==v1 || q==v2)
                    {
                        String a=String.valueOf(var1+1);
                        String b=String.valueOf(var2+1);
                        System.out.print(a+b);
                        flag=1;
                        break;
                        
                    }
                }
                if(flag==1)
                {
                    break;
                }
            }
        }
    }
    
	}
}

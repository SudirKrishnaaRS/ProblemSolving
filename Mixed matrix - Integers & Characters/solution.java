//Sudir krishnaa RS
//sudirkrish17@gmail.com
//LinkedIn: https://www.linkedin.com/in/sudirkrishnaars/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int R=sc.nextInt();
    int C=sc.nextInt();
    
    
    String ch[][]=new String[R][C];
    
    for(int i=0;i<R;i++)
        for(int j=0;j<C;j++)
            ch[i][j]=sc.next();
    
    //transpose the matrix        
    String res[][]=new String[C][R];
    for(int i=0;i<C;i++)
        for(int j=0;j<R;j++)
            res[i][j]=ch[j][i];
    
    int r=C;
    int c=R;
    
    int sum=0;  
    String output_string="";
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            String s=res[i][j];
            char c_arr[]=s.toCharArray();
            if(Character.isDigit(c_arr[0]))
            {
                int num=Integer.parseInt(s);
                sum+=num;
            }
            else
            {
                output_string+=s;
            }
            
        }
    }
    
    System.out.print(sum+"\n"+output_string);
    
    
	}
}

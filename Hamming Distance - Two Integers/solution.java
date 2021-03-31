//Sudir Krishnaa RS
//LinkedIn: https://www.linkedin.com/in/sudirkrishnaars/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

//Convert to Binary Values   
    String a_binary=Integer.toBinaryString(a);
    String b_binary=Integer.toBinaryString(b);
    
    int len_a=a_binary.length();
    int len_b=b_binary.length();
    int res_len=0;
// to make both the binary values of same length by appending '0' initially if it's of smaller length 
    if(a>b)
    {
        res_len=len_a; //assigning the max length 
        int dif=len_a-len_b;
        for(int i=0;i<dif;i++)
        {
            b_binary='0'+b_binary;
        }
    }
    else if(a<b)
    {
        res_len=len_b; // assigning the max length
        int dif=len_b-len_a;
        for(int i=0;i<dif;i++)
        {
            a_binary='0'+a_binary;
        }
    }
    
//Display the postion if it's mismatched
int cnt=0;
    for(int i=0;i<res_len;i++)
    {
        if(a_binary.charAt(i)!=b_binary.charAt(i))
        {
            cnt++;
        }
    }
    System.out.print(cnt);
    
	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int flag=0;

for(int i=0;i<N/2;i++)
{
    int prev=N-i;
    int nxt=N+i;
    
    String S_prev=String.valueOf(prev);
    String check_div_prev=String.valueOf(S_prev.charAt(0)) + String.valueOf(S_prev.charAt(S_prev.length()-1));

    int div_num_prev=Integer.parseInt(check_div_prev);
    
    String S_nxt=String.valueOf(nxt);
    String check_div_nxt=String.valueOf(S_nxt.charAt(0))
        +String.valueOf(S_nxt.charAt(S_prev.length()-1));
    
    int div_num_nxt=Integer.parseInt(check_div_nxt);
    
    if(prev%div_num_prev==0)
    {
        System.out.print(prev);
        break;
    }
    else if(nxt%div_num_nxt==0)
    {
        System.out.print(nxt);
        break;
    }
    
}
   

	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    char S_arr[]=S.toCharArray();
    int n=S.length();
    
// to store ' quotes " quotes use \' \" to store in string
    String alpha="abcdefghijklmnopqrstuvwxyz., ?\'\"";
    char alpha_arr[]=alpha.toCharArray();
    
    for(int i=0;i<n;i++)
    {
        String q=S.substring(i,i+5);
        char q_arr[]=q.toCharArray();
        
        String res="";
        for(int j=0;j<5;j++)
        {
        if(Character.isUpperCase(q_arr[j]) )
            res+="1";
        else if(Character.isLowerCase(q_arr[j]) )
            res+="0";
        }
        int decimal_val=Integer.parseInt(res,2);
        System.out.print(alpha_arr[decimal_val]);
        
        // as we want it increse in 5 so
        i=i+4;
    }
    
	}
}

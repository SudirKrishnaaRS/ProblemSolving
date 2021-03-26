//Sudir Krishnaa RS
//LinkedIn: https://www.linkedin.com/in/sudirkrishnaars/

import java.util.*;
public class Hello {
    
//this function returns a string with only vowels from passed string  
    public static String findVowels(int len,int vowels_len,char c[] ,char vowels[])
    {
        int flag=0;
        String res="";
        for(int i=0;i<len;i++)
        {
            flag=0;
            for(int j=0;j<vowels_len;j++)
            {
                if(c[i]==vowels[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                res+=c[i];
            }
        }
        
        return res;
    }


    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    String S1=sc.next();
    String S2=sc.next();
    
    char c1[]=S1.toCharArray();
    char c2[]=S2.toCharArray();
    
    String vow="aeiouAEIOU";
    char vowels[]=vow.toCharArray();
   
    String res1=findVowels(c1.length,vowels.length,c1,vowels);
    String res2=findVowels(c2.length,vowels.length,c2,vowels);
    
    int q=0;
    for(int i=0;i<c1.length;i++)
    {
        for(int j=0;j<vowels.length;j++)
        {
            if(c1[i]==vowels[j])
            {
                c1[i]=res2.charAt(q);
                q++;
                break;
            }
        }
    }
    
    q=0;
    for(int i=0;i<c2.length;i++)
    {
        for(int j=0;j<vowels.length;j++)
        {
            if(c2[i]==vowels[j])
            {
                c2[i]=res1.charAt(q);
                q++;
                break;
            }
        }
    }
    System.out.println(c1);
    System.out.println(c2);
    
	}
}

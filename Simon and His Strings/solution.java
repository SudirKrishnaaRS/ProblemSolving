import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        
        int cnt=0;
        for(int i=0;i<n;i++)
        {
                String z1="!"+arr[i];
                for(int j=i+1;j<n;j++)
                {
                    String z2=arr[j];
                    if(z1.equals(z2))
            		{
                		cnt++;
                        break;
            		}
                }
                
            
            
            if(cnt!=0)
            {
                break;
            }
            
            
        }
        
        if(cnt==0)
        {
             System.out.println("unhappy");
        }
        else
        {
            System.out.println("happy");
        }
        
        
        
    }
}





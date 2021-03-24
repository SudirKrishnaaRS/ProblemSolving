import java.util.*; 
interface Pair 
{ 
    public long getHCF(int a, int b); 
    public boolean areCoPrime(int a, int b); 
    
}

class Node implements Pair
   {
       long hcf=1;
        public long getHCF(int a,int b)
        {
            for(int i=1;i<=a && i<=b ;i++)
            {
                if(a%i==0 && b%i==0)
                {
                    hcf=i;
                }
            }
            
            return hcf;
        }
    
        public boolean areCoPrime(int a,int b)
        {
            if(hcf==1)
                return true;
            else
                return false;
        }
    
   }


public class Hello 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        Pair pair = new Node(); 
        System.out.println("HCF: " + pair.getHCF(a, b)); 
        System.out.println(pair.areCoPrime(a, b) ? "YES" : "NO"); 
        
    }
}

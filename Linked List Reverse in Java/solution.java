// Linkedlist reverse in Java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    LinkedList<Integer> arr=new LinkedList();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        int ele=sc.nextInt();
	        arr.add(ele);
	    }
	    Collections.sort(arr);
	    Collections.reverse(arr);
		System.out.println(arr);
	}
}


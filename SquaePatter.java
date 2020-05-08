import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		int i=1,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0 && n<=50)
        {
        while(i<=n)
        {
            int j=1;
            
            
            while(j<=n-i+1)
            {
                System.out.print(n-i+1);
                j++;
            }
            
            
            
            
            
            
            System.out.println();
          
            i++;
        }
        }

		
	}

}

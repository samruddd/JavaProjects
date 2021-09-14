import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        int N = s.nextInt();
        int n1 = (N+1)/2;
        int n2 = N/2;
        
        int i=1;
        while(i <= n1){
            
            int spaces=1;
            while(spaces <= n1-i){
                System.out.print(' ');
                spaces=spaces + 1;
            }
            
            int val=1;
            while(val<= 2*i-1){
                System.out.print('*');
                val=val+1;
                
            }
            System.out.println();
            i=i+1;
        }
            
            i=n2;
            while(i >= 1){
            
            int spaces=1;
            while(spaces <= n2-i+1){
                System.out.print(' ');
                spaces=spaces + 1;
            }
            
            int val=1;
            while(val<= 2*i-1){
                System.out.print('*');
                val=val+1;
                
            }
            
            System.out.println();
            i=i-1;
        }
		
	}

}

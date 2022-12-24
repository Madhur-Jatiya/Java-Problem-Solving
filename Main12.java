//amstrong numbers btwn two numbers

import java.lang.*;
import java.util.*;
public class Main11{

     public static void main(String []args){
           Scanner sc = new Scanner(System.in);
          
        System.out.print("Enter num 1 = ");
        int n1 = sc.nextInt();
        
        System.out.print("Enter num 2 = ");
        int n2 = sc.nextInt();

        System.out.println("\nNumbers btwn " + n1 + " and " + n2 + " are ");
      
           for(int i = n1; i<=n2; i++)
           {
                int num1 = i;
               
                String s = Integer.toString(i);
                int num2 = 0;
                int temp = 0;
               
                temp = num1;
                while(temp>0)
                {
                     int rem = temp%10;
                     num2 = num2 + (int)Math.pow(rem,s.length());
                     temp = temp/10;
                }
                if(num1 == num2)
                System.out.println(i);
           }
     }
}

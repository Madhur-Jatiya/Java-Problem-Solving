//check if a number contains 3 or not

import java.util.*;
import java.text.*;
public class Main{

     public static void main(String []args){
          int a = 87890173;
          int count = 0;          
          String s = Integer.toString(a);
          for(int i = 0; i<s.length(); i++)
          {
               if(s.charAt(i)== '3')
               {
                    System.out.println("found");
                    count++;
                    break; 
               }
          }
          
          if(count==0)
               System.out.println("not found");
     }
}

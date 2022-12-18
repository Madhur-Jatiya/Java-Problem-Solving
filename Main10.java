//Sum of first and last digit of a number

import java.util.*;
import java.text.*;
public class Main10{

     public static void main(String []args){
          int a = 87389017;
          
          String s = Integer.toString(a);
          char c1 = s.charAt(0);
          int i1 = Integer.parseInt(String.valueOf(c1));
          char c2 = s.charAt(s.length()-1);
          int i2 = Integer.parseInt(String.valueOf(c2));
          
          System.out.println(i1+i2);
     }
}

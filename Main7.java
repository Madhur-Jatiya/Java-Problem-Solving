//print consonants counts in a string
import java.util.*;

public class Main7{

     public static void main(String []args){
         String s = "hello world";
         
         LinkedHashMap<Character,Integer> map = new LinkedHashMap();
         
         for(int i =0; i<s.length(); i++)  
         {
            int count = 0;
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
            }
            
            else if(s.charAt(i)==' ')
            continue;
            
            else{
               if(map.containsKey(s.charAt(i)))
               {
                  count = map.get(s.charAt(i));
                  map.put(s.charAt(i),count+1);
               }
               else
               map.put(s.charAt(i),1);
            }
         }
         
         System.out.println(map);
      }
     
}

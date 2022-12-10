//first non duplicate character in a string

import java.util.*;
public class Main1{

     public static void main(String []args){
        String s = "hfgsjfgsgfkqah";
        
        ArrayList<Character> list = new ArrayList();
        
        for(int i = 0; i<s.length(); i++)
        {
            if(list.contains(s.charAt(i)))
            {
				Character ch = s.charAt(i);
				list.remove(ch);
            }
            else{
                list.add(s.charAt(i));
            }
        }
		
        System.out.println(list.get(0));
     }
}
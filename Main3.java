// duplicate character in a string

import java.util.*;
public class Main3{

     public static void main(String []args){
        String s = "hfgsjfgsgfkqah";
        
        TreeSet<Character> set = new TreeSet<Character>();
        ArrayList list = new ArrayList();
        
        for(int i = 0; i<s.length(); i++)
        {
            if(list.contains(s.charAt(i)))
            {
				set.add(s.charAt(i));
            }
            else{
                list.add(s.charAt(i));
            }
        }
		
		// set.forEach((Character c) ->{
		// 	System.out.print(c);
    	//  });
		
		for(char c:set)
		System.out.print(c);
	 }
}
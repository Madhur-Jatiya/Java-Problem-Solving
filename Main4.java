// reverse the HashMap

import java.util.*;
public class Main4{

     public static void main(String []args){
        HashMap<Integer, String> map = new HashMap();
		
		map.put(1,"Uttam");
		map.put(2,"Praveen");
		map.put(3,"Nitesh");
		map.put(4,"Apurva");
		
		System.out.println("Print in Ascending order");
		for(Integer i : map.keySet())
		System.out.println(i + " " + map.get(i));
		
		System.out.println("\nPrint in Reverse order");
		
		ArrayList<Integer> list = new ArrayList(map.keySet());
		Collections.reverse(list);
		
		for(Integer i : list)
		System.out.println(i + " " + map.get(i));
	 }
}
// Find element without pair

import java.util.*;
public class Main{

     public static void main(String []args){
		 
		 int arr[] = new int[7];
		 arr[0] = 9;
		 arr[1] = 3;
		 arr[2] = 9;
		 arr[3] = 3;
		 arr[4] = 9;
		 arr[5] = 7;
		 arr[6] = 9;
		 
        ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for(int i =0; i<arr.length; i++)
		{
			if(list.contains(arr[i]))
			{
				list2.add(arr[i]);
			}	
			list.add(arr[i]);
		}

		list.removeAll(list2);
		System.out.println(list);
		
	 }
}
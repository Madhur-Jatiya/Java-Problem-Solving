import java.util.*;

public class Main8{

     public static void main(String []args){
         // int arr[] = {1,2,3,4,5};
         int arr[] = {3,2,1};
         
         Main m = new Main();
         System.out.print(Arrays.toString(m.prob(arr)));
      }
      
      public int[] prob(int arr[])
      {
         int arr1[] = new int[arr.length];
         for(int i = 0 ; i< arr.length; i++)
         {
            int element = 1;
            for(int j =0; j<arr.length; j++)
            {
               if(i!=j)
               {
                  element = element*arr[j];
               }
            }
            arr1[i] = element;
         }  
         return arr1;
      }
}

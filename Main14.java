//circular array

import java.util.*;
public class Main{

     public static void main(String []args){
          int arr[] = {-3,-2,-1,0,1,2,3};
          int n = 1;
          
          for(int i =0; i<n; i++)
          {
               int temp = arr[i];
               for(int j =1; j<arr.length; j++)
               {
                    arr[j-1] = arr[j];
               }
               arr[arr.length-1]= temp;
          }
          
          System.out.println(Arrays.toString(arr));
     }
}

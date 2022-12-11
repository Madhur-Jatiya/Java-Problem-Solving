import java.util.*;

public class Main9{

     public static void main(String []args){
         int arr[] = {10,15,3,7};
         int k = 22;
         
         Main m = new Main();
         System.out.print(m.prob(arr,k));
      }
      
      public boolean prob(int arr[],int k)
      {
         int arr1[] = new int[arr.length];
         for(int i = 0 ; i< arr.length; i++)
         {
            for(int j =0; j<arr.length; j++)
            {
               if(i!=j)
               {
                  if(k == arr[i]+arr[j])
                  {
                     return true;
                  }
               }
            }
         }  
         return false;
      }
}

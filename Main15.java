import java.util.*;
public class Main15{

     public static void main(String []args){
          int arr[][] = {{1,1,1,1},{1,0,1,1},{1,1,1,1}};
          ArrayList list = new ArrayList();
          
          System.out.println(Arrays.toString(arr[0]));
          System.out.println(Arrays.toString(arr[1]));
          System.out.println(Arrays.toString(arr[2]));
          
          for(int i =0; i<arr.length; i++)
          {
               for(int j =0; j<arr[i].length; j++)
               {
                    if(arr[i][j]==0)
                    {
                         list.add(i);
                         list.add(j);
                    }
               }
          }
          
          Main m = new Main();
          int arr1[][] = m.put(list,arr);
          

          System.out.println("\n" + Arrays.toString(arr1[0]));
          System.out.println(Arrays.toString(arr1[1]));
          System.out.println(Arrays.toString(arr1[2]));
     }
     
     public int[][] put(ArrayList list,int arr[][])
     {
          for(int i =0; i<arr.length; i++)
          {
               for(int j =0; j<arr[i].length; j++)
               {
                    if(list.contains(i) || list.contains(j))
                    {
                         arr[i][j] = 0;
                    }
               }
          }
          
          return arr;
     }
}

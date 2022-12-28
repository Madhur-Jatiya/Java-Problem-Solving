import java .util.*;

class Main17
{
     public static void main (String[] args)
     {
          int K = 5;
          int cost[] = {1,3,2,1,1};
          int count = 0;
          int sum = 0;
          
          Arrays.sort(cost);
          
          for(int i = 0; i<cost.length; i++)
          {
               if((sum + cost[i])<=K)
               {
                    sum = sum + cost[i];
                    count++;
               }
          }

          System.out.println(count);
     }
}

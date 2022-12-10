//minimum element not present in arr
import java.util.*;

public class Main6{

     public static void main(String []args){
        int arr[] = {7,2,5,1,9,0,3};
        
        Arrays.sort(arr);
   
        for(int i =0; i<arr.length;i++){
           if(arr[i]==i){}
           
           else{
            System.out.println(i);
            break;
			}
        }
     }
     
}

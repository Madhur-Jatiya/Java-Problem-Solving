//closest number to 100

import java.lang.*;
public class Main2{

     public static void main(String []args){
        int num = 199;
		int num1 = 132;
		
		
		if(Math.abs(100-num)>Math.abs(100-num1))
		{
			System.out.println(num1);
		}
		
		else{
			System.out.println(num);
		}
     }
}
import java.io.*;
import java.util.*;

public class CS6082Aashikari {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(new File("inputData2A.txt"));
	    int[] list = new int[100];

	        for (int i = 0; i < list.length; i++){
	        		list[i] = in.nextInt();
	        }
	        
	        int n = list.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (list[j] > list[j+1])
	                {
	                    // swap temp and list[i]
	                    int temp = list[j];
	                    list[j] = list[j+1];
	                    list[j+1] = temp;
	                }
	        
	        
	        //Arrays.sort(list);
	        
	        System.out.println(list[10]);
	        System.out.println(list[25]);
	        System.out.println(list[50]);
	        System.out.println(list[70]);
	        System.out.println(list[90]);
	        
	        //for (int k = 0; k < list.length; k++) {   	 	
	        //		System.out.println(list[k]);  	
    	    //}
	        

	    
	    in.close();
	    
	} 
}
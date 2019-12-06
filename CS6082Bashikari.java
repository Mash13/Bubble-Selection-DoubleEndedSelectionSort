import java.io.*;
import java.util.*;

public class CS6082Bashikari {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(new File("inputData2B.txt"));
	    int[] list = new int[1000];
	    int[] list2 = new int[1000];
	    int[] list3 = new int[1000];
	    
	    //bubble sort
	        for (int i = 0; i < list.length; i++){
	        		list[i] = in.nextInt();
	        }
	        
	        list2 = list;
		    list3 = list;
	        
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
	        System.out.println("Bubble Sort");
	        System.out.println(list[100]);
	        System.out.println(list[125]);
	        System.out.println(list[250]);
	        System.out.println(list[700]);
	        System.out.println(list[900]);
	        System.out.println("Time elapsed in nanoseconds for bubble sort = ");
	        System.out.println(System.nanoTime());
	        System.out.println("------------------ ");
	        
	        //selection sort
	        
	            int n2 = list2.length;
	     
	            // One by one move boundary of unsorted subarray
	            for (int i = 0; i < n2-1; i++)
	            {
	                // Find the minimum element in unsorted array
	                int min = i;
	                for (int j = i+1; j < n2; j++)
	                    if (list2[j] < list2[min])
	                        min = j;
	     
	                // Swap the found minimum element with the first
	                // element
	                int temp = list2[min];
	                list2[min] = list2[i];
	                list2[i] = temp;
	            }
	            System.out.println("Selection Sort");
	            System.out.println(list2[100]);
		        System.out.println(list2[125]);
		        System.out.println(list2[250]);
		        System.out.println(list2[700]);
		        System.out.println(list2[900]);
		        System.out.println("Time elapsed in nanoseconds for selection sort = ");
		        System.out.println(System.nanoTime());
		        System.out.println("------------------ ");
	    
	    //double ended selection sort
	        
	        int temp;

	        for(int i = 0; i < list3.length; i++){
	            for(int leastIndex = i + 1; leastIndex < list3.length; leastIndex++){
	                if(list3[i] > list3[leastIndex]){
	                    temp = list3[i];
	                    list3[i] = list3[leastIndex];
	                    list3[leastIndex] = temp;
	                }
	            }
	        }
	        System.out.println("Double-Ended Selection Sort");
	        System.out.println(list3[100]);
	        System.out.println(list3[125]);
	        System.out.println(list3[250]);
	        System.out.println(list3[700]);
	        System.out.println(list3[900]);
	        System.out.println("Time elapsed in nanoseconds for double-ended selection sort = ");
	        System.out.println(System.nanoTime());
	    
	    in.close();
	    
	} 
}
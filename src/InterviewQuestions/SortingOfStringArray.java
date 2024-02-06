package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingOfStringArray {

	public static void main(String[] args) {

		String sa[]= {"rahul","mukesh","kishan","raunak","Aziz"};
		

		
		
		
		List<String> li=	Arrays.asList(sa);
	Collections.sort(li);
	
		System.out.println(li.toString());
		
		
		// Arrays.sort(a[]);---void
		// sort(originalArray, fromIndex, endIndex) 
		// // Arrays.spliterator() method ---->>>   To sort the array using normal sort
		//  Arrays.parallelSort(intArr); -->> To sort the array using parallelSort 
		
		
		//  Arrays.toString()-->return All the Array Element in String format
		//  Arrays.compare(array1,array2);-- 0,1,-1
		// Array.copyOf(array,lengthofNewAray);-->array
		// Array.copyOfRange(array,StartINdex,EndIndex);-->array
		// Arrays.toString(a) -->o/p in one line in STring format
		// Arrays.binarySearch(array,int ele)--->return index
		//
		
		
		
		
	
	/*	
		
		int a[]= {23,14,15,11,80};
	//	int b[]= {23,14,15,11,80};
		Arrays.sort(a);
		int key=11;
	           System.out.println(Arrays.binarySearch(a, key)); 
		
	/*	Arrays.sort(a);          
		 for(int m:a) {
		    	System.out.println(m);
		    }
		 
		System.out.println(Arrays.toString(a));
		
	/*	
		
	//	System.out.println(Arrays.compare(a, b));// if arrays are same -- 0,else 1
		    int n[]=Arrays.copyOf(a, 10);
		    for(int x:n) {
		    	System.err.println(x);
		    }
	
	
	
	//Arrays.
		for(int i=0;i<sa.length;i++) {
			
			
		}   */
	}

}





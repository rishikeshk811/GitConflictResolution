package javaProgramme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindfrequentlyRepeaatingNoinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[]= { 67,12,34,51,53,90,12,12,34,67,12,34,34};
		
	HashMap<Integer, Integer> hs=new HashMap<Integer, Integer>();
	
	
	
		for(int i=0;i<x.length;i++) {
			int count=0;
			for(int j=0;j<=x.length-1;j++) {
				if (x[i]==x[j]) {
					count++;
				}
	
			}
			
			
				hs.put(x[i], count);
			
		}
		System.out.println(hs);
int max=0;
for( Entry<Integer, Integer> en :hs.entrySet()) {
	if (en.getValue()>max) {
		max=en.getValue();
	}
}
System.out.println(max);
int maxkey=0;
   for( Entry<Integer, Integer> en :hs.entrySet()) {
	if (en.getValue()==max) {
		System.out.println(en.getKey()+" is repeating maximum times "+en.getValue());
		if (en.getKey()>maxkey) {
			maxkey=en.getKey();
		}   
	}
}                                    

   System.out.println(maxkey+" is the biggest key with Maximum occurence of "+max);
	}           
}








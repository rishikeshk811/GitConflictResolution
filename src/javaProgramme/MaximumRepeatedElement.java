package javaProgramme;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaximumRepeatedElement {

	public static void main(String[] args) {

		int x[]= {1,2,3,1,2,3,3,5,4,5,5,8};
	
		
		
		
		
	
		HashMap<Integer, Integer> hs =new HashMap<Integer, Integer>();
		for(int i=0;i<x.length;i++) {
			int count=0;
			for(int j=0+i;j<x.length;j++) {
				
		
				
				if (x[i]==x[j]) {
    
					if (i>j) {
						break;
					}
					else {
						count++;
					}

				}
			}
			
			
				System.out.println(x[i]+"---->> "+count);
			
			
		
	/*		if (count>max) {
				max=count;
				ele=x[i];
			}  */
			
			
			
			
		}
		int maxval=0;
	//	System.out.println(ele+"--->> "+max);
	//	for(  Entry<Integer, Integer> en :hs.entrySet()) {
			
		//	System.out.println(en.getKey()+"----> "+en.getValue());
	//	}
	//	System.out.println(maxval);
  /*  for(  Entry<Integer, Integer> en :hs.entrySet()) {
			
			if (en.getValue()==maxval) {
				System.out.println(en.getKey()+"----> "+en.getValue());
			}
		}   */
		
	}

}







package assignmentSanjaySir;

public class IntegerArray {

	public static void main(String[] args) {

		int x[]= {5,4,4,2,5,4,2,3,4};
		
		for(int i=0;i<x.length;i++) {
			int count=0;
			for(int j=0;j<x.length;j++) {
				
				if (x[i]==x[j]) {
					
					if (i>j) {
						break;
					}
					else {
						count++;
					}
					
				}
			}
			//remove duplicates element  from the array 
			
			if (count>=1) {
				System.out.println(x[i]);
			}
	/*		ouccerence of each character in the array 
	 * if (count>=1) {
	 
				System.out.println(x[i]+"--  >> "+count);

			}   */
			//print only  duplicates from array along with the count 
		/*	if (count>1) {
				 
				System.out.println(x[i]+"---> "+count);
	}       */
			// unique Element in the Array
	/*		if (count==1) {
				 
				System.out.println(x[i]);
	}     */  
			
		
		}
		
	}

}

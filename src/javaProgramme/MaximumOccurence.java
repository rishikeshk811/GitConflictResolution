package javaProgramme;

public class MaximumOccurence {

	public static void main(String[] args) {

		int x[]= {4,3,4,2,11,3,3,3,4,4};
		
		int maxoccuer=0;
		int secondmax=0;
		int secondele=0;
		int ele=0;
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
			if (count>maxoccuer) {
				
				maxoccuer=count;
			
				ele=x[i];
			}
			 if (count>=1) {
				System.out.println(x[i]+" --- >> "+count);
			}
			
		}
		System.out.println(ele+" is repeating maximum --- >> "+maxoccuer+"  times ");
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

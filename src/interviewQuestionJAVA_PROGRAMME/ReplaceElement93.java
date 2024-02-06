package interviewQuestionJAVA_PROGRAMME;

public class ReplaceElement93 {

	public static void main(String[] args) {
 
		int a[]= {12,34,11,80,15};
	 
		
		for(int i=0;i<a.length;i++) {
			
		
			
			
			
			
			
			if (i==0) {
			
				System.out.println(a[i+1]);

			}
			 else if (i==a.length-1) {
				
					System.out.println(a[i-1]);

		
		}
			 else {
				
					
					System.out.println(a[i-1]+a[i+1]);
			}
			
			
			

		
	}

	}	
	
}














package interviewQuestionJAVA_PROGRAMME;

public class RepeatativeDigit_72 {

	public static void main(String[] args) {
	
		int n=1000;
		// smallest 2 digit number is 10 
		for(int i=10;i<n;i++) {
		     boolean rs=	repeatative(i);
		     if (rs==true) {
				System.out.println(i);
			}
		}

	}

	
	
	
	
	public static boolean repeatative(int n) {
	
		boolean flag =false ;
		
		if(n>0) {
			int r=n%10;
			n=n/10;
			if (r==n) {
				flag=true;
			}
			
		}
		
	return flag;	           
		
		
	/*	boolean flag =false;
		while(n>0) {
			
			int r=n%10;
			n=n/10;
			if (r==n) {
				flag=true;
			}
			else {
				break;
			}
		}            */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

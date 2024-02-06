package javaProgramme;

public class ZigZagString {

	public static void main(String[] args) {

		String s ="PAYPALISHIRING";
/*	int row=3;
	// o/p --> PAHNAPLSIIGYIR
	        // PAHNAPLSIIGYIR 
	String m="";
	String n="";
	String newS="";
	for(int i=0;i<s.length();i++) {
	
		
		
		
		
		if (i%4==0) {
			m=m+s.charAt(i);
		}
		else if (i%2!=0) {
			n=n+s.charAt(i);
		}
		else {
             newS=newS+s.charAt(i);
		}
	}
	System.out.println(m+n+newS);	    */
		
		int row=4;
		// o/p --> PAHNAPLSIIGYIR
		        // PAHNAPLSIIGYIR 
		String m="";
		String n="";
		String newS="";
		for(int i=0;i<s.length();i++) {
		
			
			
			
			
			if (i%6==0) {
				m=m+s.charAt(i);
			}
			else if (i%2!=0) {
				n=n+s.charAt(i);
			}
			else {
	             newS=newS+s.charAt(i);
			}
		}
		System.out.println(m+n+newS);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

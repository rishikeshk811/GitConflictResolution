package StringProgaramme;

public class aabbabc {

	public static void main(String[] args) {

		String st ="aabbabc";
		
		// o/p -- a2b2a1b1c1   
		// o/p -- a3b3c1

		
		
		
	// this is the PRogramme for First OUtput	
		
		int count=1;
		
	
		
		for(int i=0;i<st.length()-1;i++) {
			if (st.charAt(i)==st.charAt(i+1)) {
				count++;
			}
			else {
				System.out.println(st.charAt(i)+"-->> "+count);
				count=1;
			}
			
		}
		System.out.println(st.charAt(st.length()-1)+" -- >> "+count);      
		// this is Programme for Second Output
	/*	for(int i=0;i<=st.length()-1;i++) {
			int count=0;
			for(int j=0;j<=st.length()-1;j++) {
				if (st.charAt(i)==st.charAt(j)) {
		 			if (i>j) {
						break;
					}
					else {
						count++;
					}
				}
				
			}
			if (count>=1) {
				System.out.print(st.charAt(i));
				System.out.print(count);
			}
			
		}      */
		
		
		
		
		
		
		
	}

}

		
		
		
		
		
		
		
		
package StringProgaramme;

public class Occurence159 {

	public static void main(String[] args) {
		//find Occerence of each Character 
		// find duplicate character 
		// Remove Duplicate character 
		// find uinque character 

		String s="aabbcccdddabbcmnoo";
		
		boolean rs[]=new boolean[s.length()];
		
		
		for(int i=0;i<s.length();i++) {
			
			
			int count=0; 
			
			if (rs[i]==false) {
				
				for(int j=0;j<s.length();j++) {
					
		                   if (s.charAt(i)==s.charAt(j)) {
							count++;
							rs[j]=true;
						}
					
				}
				
			
		
			}
			if (count>=1) {
				System.out.print(s.charAt(i));
			} 
		
		}
	}

}





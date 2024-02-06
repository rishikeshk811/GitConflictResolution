package StringProgaramme;

import java.util.LinkedHashSet;

public class NoOfVowel {

	public static void main(String[] args) {

		String s ="iNdia";
		String st= s.toLowerCase();
		// printing only vowel and count 
		
		
		
		
		
		
/*	  int count =0;
 	for(int i=0;i<st.length();i++) {
			if (st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u') {
				System.out.println(st.charAt(i));
				count++;
			}
			
		}    
		
		
		System.out.println(count);   */
		LinkedHashSet<Character> ls =new LinkedHashSet<Character>();
		for( int i=0;i<st.length();i++) {
			if (st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u')  {
				ls.add(st.charAt(i));
			}
		}
		int c=0;
		for(Character c1 : ls) {
			
			if (c1=='a' ||c1=='e' || c1=='i' || c1=='o' || c1=='u') {
				System.out.println(c1);
				c++;
			}
		}
		
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

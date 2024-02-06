package StringProgaramme;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesUsingMap {

	public static void main(String[] args) {

		String s="Tester";
	     String st=	s.toLowerCase();
	     HashMap<Character, Integer> hm =new HashMap<Character, Integer>();
	     for(int i=0;i<st.length();i++) {
	    	 int c=1;
	   
	    	 
	    	 
	    	 
	    	 
	    	 if (hm.containsKey(st.charAt(i))) {
				
	    		 hm.put(st.charAt(i), hm.get(st.charAt(i))+1);
			}
	    	 else {
				hm.put(st.charAt(i),c );
			}
	     }
	     // printing Occurencer of Each Character of the String 
	//     System.out.println(hm);
	     
	     // printing duplicate Character of the String 
	/*     for(    Entry<Character, Integer>entry:hm.entrySet()) {
	    	 if (entry.getValue()>1) {
				System.out.println(entry.getKey()+"--- >> "+entry.getValue());
			}
	     }   */
	/* printing unique character of the String 
	     
	     for(    Entry<Character, Integer>entry:hm.entrySet()) {
	    	 if (entry.getValue()==1) {
			}
	     }      */
	// removing duplicate Character 
	     
	     for(    Entry<Character, Integer>entry:hm.entrySet()) {
	    	System.out.println(entry.getKey());
	     } 
	     
	     
	     
	     
	     
	     
	     
	     
	}

}

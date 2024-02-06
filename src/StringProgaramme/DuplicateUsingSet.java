package StringProgaramme;

import java.util.LinkedHashSet;

public class DuplicateUsingSet {

	public static void main(String[] args) {

		String s="Tester";
	     String st=	s.toLowerCase();
	     
	 
	     
	     LinkedHashSet<Character> lset =new LinkedHashSet<Character>();
	     
	     
	
	     
	     // Remove duplicate and find the Occurence and find the Unique characte in the String 
	     
	     
	     for(int i=0;i<st.length();i++) {
	    	 lset.add(st.charAt(i))	;  
	    	 }
	     // entry character integer
	     // duplicates removed 
	//     System.out.println(lset);
	     for( Character c  :lset) {
	    	 int count=0;
	    	 for(int j=0;j<st.length();j++) {
	    		 if (c==st.charAt(j)) {
					count++;
				}
	    	 }
	    	 // printing occurence 
	    //	 System.out.println(c+" --- >> "+count);
	    	 // unique Element
	 /*   	 if (count==1) {
				System.out.println(c+" ---- >> "+count);
			}    */
	    	 // printing duplicates 
	    	 if (count>1) {
					System.out.println(c+" ---- >> "+count);
				}
	     }
	}

}

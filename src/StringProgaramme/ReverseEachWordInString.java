package StringProgaramme;

public class ReverseEachWordInString {

	public static void main(String[] args) {
 String st ="i am Software Engineer";
  /*      char ch[]=  st.toCharArray();
     
 for(int i=0;i<ch.length;i++) {
	   String rev ="";
	 while(i<ch.length &&i!=' '){
		rev=ch[i]+rev;
	//	 System.out.print(ch[i]);
		i++;
	}
	
	 
	 
	 
	 System.out.print(rev);
 }                                                 */
 
 
     String s[]=st.split(" ");
    	 for(int i=0;i<s.length;i++) {
    		    String srev =s[i];
    		    
    		    for(int j =srev.length()-1;j>=0;j--) {
    		  
    		    	System.out.print(srev.charAt(j));
    		    
    		    }
    		    System.out.print(" ");
    		  
    	 }
     
	}

}

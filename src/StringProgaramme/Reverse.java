package StringProgaramme;

import java.util.Iterator;

public class Reverse {

	public static void main(String[] args) {

		String st ="Aabb1235dd45ee1ff44";
		// 44 1 45 12345
		String rev="";
		for(int i=st.length()-1;i>=0;i--) {
			
			
		
			
			if (st.charAt(i)>='0'  && st.charAt(i)<='9') {
		//	System.out.print(st.charAt(i));
				
				rev=rev+st.charAt(i);
			}
			else {
				rev=rev+" ";
			}
		
		}
		// 123545144
	//	System.out.println(rev);
		
		
	           String[] sr=	rev.split(" ");
	           
	           for(int i=0;i<sr.length;i++) {
	        	   String temp =sr[i];
	        	   
	        	   
	        	   for( int j=temp.length()-1;j>=0;j--) {
	        		   
	        		   if (temp.charAt(j)!=' ') {
	        			   System.out.print(temp.charAt(j));
					}
	        		  
	        	   }
	        	   System.out.print(" ");
	           }
/*
 for(int i=st.length()-1;i>=0;i--) {
 
			
			
			String rev="";
			
			if (st.charAt(i)>='0'  && st.charAt(i)<='9') {
			      
				while(i>=0 && st.charAt(i)!=' ' ) {
					rev=st.charAt(i)+rev;
					i--;
				}
			}
		System.out.println(rev);
		}            */
	}

}


		
		
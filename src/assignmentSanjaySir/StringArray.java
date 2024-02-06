package assignmentSanjaySir;

public class StringArray {

	public static void main(String[] args) {
 String s ="hii hello Hii Hello Welcome";
       String st=  s.toLowerCase();
		
       
       for(int i=0;i<st.length();i++) {
    	   int count=0;
    	   for(int j=0;j<st.length();j++) {
    		   if (st.charAt(i)==st.charAt(j)) {
				if (i>j) {
					break;
				}else {
					count++;
				}
				
			}
    	   }
    	   // remove duplicate character from  the String 
    	/*   if (count>=1) {
			System.out.print(st.charAt(i));
		}    */
    	   // print the occurence of each character in the String 
    /*	   if (count>=1) {
   			System.out.println(st.charAt(i)+" --->> "+count);
   		}    */
    	   // print only duplicate character of String along with the count 
    /*	   if (count>1) {
   			System.out.println(st.charAt(i)+"--->> "+count);
   		}   */
    	   // print only unique character of the String 
    	   if (count==1) {
   			System.out.println(st.charAt(i));
   		}  
       }
	}

}

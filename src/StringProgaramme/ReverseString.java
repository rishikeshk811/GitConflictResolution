package StringProgaramme;

public class ReverseString {

	public static void main(String[] args) {

		String s="Software";
		int n=s.length()-1;
		reverse(s,n);
	/*		for(int i=s.length()-1;i>=0;i--) {
				System.out.print(s.charAt(i));
			}
			
			System.out.println("-------------->>");
		
			
			        */
			
			
	/*		int n=s.length()-1;
			while(n>=0) {
				System.out.print(s.charAt(n));
				n--;
			}    */
		
		
	/*	    char ch[]=s.toCharArray();
		    for(int i=ch.length-1;i>=0;i--) {
		    	System.out.print(ch[i]);
		    }   */
		   /*
		    * 1.using String buffer 
		    * 2.using string builder
		    * 3.converting string in to array 
		    * 4.taking extra string variable and concatinating every character every time 
		    * 5.revere for loop using charAt Method of String 
		    * 6.using while loop
		    * 7 using recursion
		    *  
		    *  
		    *  
		    *  
		    *  
		    *  
		    */
	/*	String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		    System.out.println(rev);     */
	}
	public static void reverse(String s,int n) {

		if (n>=0) {
			System.out.print(s.charAt(n));
			n--;
			reverse(s,n);
			
		}  
			
		
	}

}

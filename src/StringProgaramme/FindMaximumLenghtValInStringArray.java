package StringProgaramme;

public class FindMaximumLenghtValInStringArray {

	public static void main(String[] args) {

	/*	String s ="this is Risikesh singh Rajput";
		String st[]=s.split(" ");   */
		
		String st[]= {"ab","abc","abcd","egfgfgfgf","edcf"};
		    
		  
		    
		    
		    
		    
		    
		    
		/*    int maxchar=0;
		    String newst="";   */
		    int minchar=0;
		    String minString="";
		    
		    for( int i=0;i<st.length;i++) {
		    	int count=0;
		    	String temp=st[i];
		    	for( int j=0;j<temp.length();j++) {
		    		if (temp.charAt(j)!=' ') {
						count++;
					}
		    	}
		    	
		   /* this is for maximum 
		    *  	if (count>maxchar) {
		  
					maxchar=count;
					newst=temp;
						}          */
		    	if (count<minchar) {
		  		  
		    		minchar=count;
		    		minString=temp;
						}   
		    } 
		    System.out.println(minString+" String has minimum character "+minchar);
	}

}












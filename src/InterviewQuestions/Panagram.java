package InterviewQuestions;

public class Panagram {

	public static void main(String[] args) {

		String s="abcdefghijklmnopqrstuvwxya";
	  boolean flag=false;
		String st=	s.toLowerCase();
	        if (st.length()>=26) {
                    for(char i='a';i<='z';i++) {
	    			           
                    	if (st.contains(String.valueOf(i))) {
							flag=true;
						}
                    	else {
                    		flag=false;
							break;
						}
                    	
	    		}
			}
	        else {
	        	System.out.println("String "+st+" is not panagram ");
			}
		if (flag==false) {
			System.out.println("String "+s+" is not Panagram ");
		}
		else {
			System.out.println("String "+s+" is  Panagram ");
		}
		
	}

}

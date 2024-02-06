package interviewQuestionJAVA_PROGRAMME;

public class PrintOnlyNumber_58 {

	public static void main(String[] args) {


		
		String s= "I a1m goi123ng to fi3215nd pro234duct for the num1212bers ins1212ide th1212is st3245ring";
		   
                   
	
		
		
		  String temp="";
		
		for(int i=0;i<s.length();i++) {
                    
                    	 
                    	   
                    	   if (s.charAt(i)>='0'  && s.charAt(i)<='9') {
							temp=temp+s.charAt(i);
						}
                    	   else if (!temp.equals("")) {
							System.out.print(temp+"*");
							temp="";
						}
                       }
	}

}

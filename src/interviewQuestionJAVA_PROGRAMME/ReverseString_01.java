package interviewQuestionJAVA_PROGRAMME;

public class ReverseString_01 {

	public static void main(String[] args) {

String s =" Welcome to Expleno ";
          String newSt="";
for(int i=s.length()-1;i>=0;i--) {
	
              	if (s.charAt(i)!=' ') {
		
              		newSt=s.charAt(i)+newSt;
              		
                 	}
              	
              	
              	if ( (i==0 && s.charAt(i)!=' ' ) || s.charAt(i)==' ' ) {
                		System.out.print(newSt+" ");
    					newSt="";
    			
				}
              	
              	
}
	}

}

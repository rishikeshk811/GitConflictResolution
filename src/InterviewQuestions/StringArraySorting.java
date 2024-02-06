package InterviewQuestions;

public class StringArraySorting {

	public static void main(String[] args) {
		
		
		
		String sa[]= {"rahul","mukesh","kishan","raunak","Aziz"};
		
		for(int i=0;i<sa.length;i++) {
			
			
			
			
			
                   String s1=sa[i];
			for(int j=i+1;j<sa.length;j++) {
				String s2=sa[j];
				checkBigger(s1,s2);
				
				
				
			}
		}
	}
	public static void checkBigger(String s1,String s2) {
		
		
		    char [] ch1=s1.toCharArray();
		    char [] ch2=s2.toCharArray();
		   

	}

}

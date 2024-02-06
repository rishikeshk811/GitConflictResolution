package interviewQuestionJAVA_PROGRAMME;

import java.awt.Checkbox;

public class AnagramString {

	public static void main(String[] args) {

		String s1 ="peek";
		String s2 ="kjep";
		            char ch1[]=s1.toCharArray();
		            char ch2[]=s2.toCharArray();
	if (s1.length()==s2.length()) {
		
		for(int i=0;i<ch1.length;i++) {
		
			
			boolean flag=false;
			for(int j=0;j<ch2.length;j++) {
				
				if (ch1[i]==ch2[j]) {
					    ch2[j]=' ';
					    
					
				}
		/*		else if (condition) {
					
				} */
			}  
				
	}
	}
	else {
		System.out.println(" both the String "+s1+" and "+s2+" is not Anagram to Each Other ");
		
	}
	
	}
}
	
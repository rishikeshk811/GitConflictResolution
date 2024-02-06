package interviewQuestionJAVA_PROGRAMME;

import org.xml.sax.ext.Attributes2;

public class FindString_64 {

	public static void main(String[] args) {
	
		String s="This is fun show";
		String s1="fun tv show";
		String [] s1s =s1.split(" ");
		String [] ss =s.split(" ");

		for(int i=0;i<ss.length;i++) {
			
	
			if (s1.contains(ss[i])) {
				
			}
			else {
				System.out.print(ss[i]+" ");
			}
		
		}
		for(int i=0;i<s1s.length;i++) {
			
			
			if (s.contains(s1s[i])) {
				
			}
			else {
				System.out.print(s1s[i]+" ");
			}
		
		}
		
	}

}

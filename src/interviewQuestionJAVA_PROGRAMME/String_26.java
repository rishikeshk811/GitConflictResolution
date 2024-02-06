package interviewQuestionJAVA_PROGRAMME;

public class String_26 {

	public static void main(String[] args) {
		
		String s ="Selenium";
		
		for(int i=0;i<s.length();i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
	}

}

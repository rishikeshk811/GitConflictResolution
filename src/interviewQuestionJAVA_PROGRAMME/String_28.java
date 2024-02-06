package interviewQuestionJAVA_PROGRAMME;

public class String_28 {

	public static void main(String[] args) {

		String s ="aabbaa"        ; ;
	
		for(int i=0;i<s.length();i++) {
			if (i!=s.length()-1) {
				System.out.print(s.charAt(i)+""+s.charAt(i+1)+" ");
			}
		}
	}

}

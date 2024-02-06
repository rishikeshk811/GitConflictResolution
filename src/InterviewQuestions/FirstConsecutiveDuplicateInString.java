package InterviewQuestions;

public class FirstConsecutiveDuplicateInString {

	public static void main(String[] args) {

		String s="GeekForGeek";
		
		for(int i=0;i<s.length();i++) {
			
				if (i<s.length() && s.charAt(i)==s.charAt(i+1)) {
					System.out.println(s.charAt(i));
					break;
				}
			
		}
	}

}

package interviewQuestionJAVA_PROGRAMME;

public class CountCharacter_19 {

	public static void main(String[] args) {
		String s ="Malyalam"           ;
		String st =s.toLowerCase();
		String res ="";
		for(int i=0;i<st.length();i++) {
			int count=0;
			for(int j=0;j<st.length();j++) {
				if (st.charAt(i)==st.charAt(j)) {
					
					if (i>j) {
						break;
					}
					else {
						count++;
					}
				}
			}
		}
 
	}

}

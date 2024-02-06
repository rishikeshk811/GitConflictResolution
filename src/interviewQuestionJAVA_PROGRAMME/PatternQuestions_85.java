package interviewQuestionJAVA_PROGRAMME;

public class PatternQuestions_85 {

	public static void main(String[] args) {

		
		String st="i am form banglore";
		  String [] s =st.split(" ");
		for( int i=0;i<s.length;i++) {
			String temp =s[0];
			for(int j=1;j<s.length;j++) {
				s[j-1]=s[j];
				System.out.print(s[j]+" ");
			}
			
			
			s[s.length-1]=temp;
			System.out.println(temp);
		}
		
	}

}

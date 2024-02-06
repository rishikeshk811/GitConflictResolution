package interviewQuestionJAVA_PROGRAMME;

public class ReverseAlternateWords_61 {

	public static void main(String[] args) {

		String s ="this is java Programming Questions";
		String [] st =s.split(" ");
		int count=0;
		for(int i=0;i<st.length;i++) {
			String temp = st[i];
			if (i%2!=0) {
				for(int j=temp.length()-1;j>=0;j--) {
					System.out.print(temp.charAt(j));
					
				}
			
				count++;
				System.err.print(" ");
				
			}
		}
		System.out.println();
		System.out.println(count);
	}

}

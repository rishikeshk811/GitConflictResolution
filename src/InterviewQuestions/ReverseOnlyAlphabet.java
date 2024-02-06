package InterviewQuestions;

public class ReverseOnlyAlphabet {

	public static void main(String[] args) {

		String s="ri&shi@kjf2sjjhjhf3hg";
	//	String s=sss.replaceAll("[^a-zA-Z]", "");
		
		    String st=s.replaceAll("[a-zA-Z]", "");
	//	    System.out.println(s);
	  //  System.out.println(st);
		int count=0;
		for( int i=s.length()-1;i>=0;i--) {
			
		
			
			if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				System.out.print(s.charAt(i));
			}
			else {
				System.out.print(st.charAt(count));
				count++;
			}
			
		}           
	}

}

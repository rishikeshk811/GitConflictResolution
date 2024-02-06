package InterviewQuestions;

public class String1 {

	public static void main(String[] args) {


	
		
		
		
		
		
		
		
		
		
		String st="i love Tyss";
		 
	String s1=st.replaceAll(" ", "");
	int count=s1.length()-1;

	for(int i=0;i<st.length();i++) {
		
	

		if (st.charAt(i)!=' ') {
			System.out.print(s1.charAt(count--));
		}
		else {
			System.out.print(st.charAt(i));
		}
	}
	}

}
 
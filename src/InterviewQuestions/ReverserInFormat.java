package InterviewQuestions;

public class ReverserInFormat {

	public static void main(String[] args) {

	
		
		String s ="i love Tyss";
		  String st= s.replaceAll(" ", "");
		  int count=st.length()-1;
		  for( int i=0;i<s.length();i++) {
			  if (s.charAt(i)!=' ') {
				System.out.print(st.charAt(count--));
			}
			  else {
		  
			  System.out.print(s.charAt(i));
		  }
	
		
	}
	}
}

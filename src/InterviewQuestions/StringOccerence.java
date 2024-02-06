package InterviewQuestions;

public class StringOccerence {

	public static void main(String[] args) {

		String s ="a1a2b1c3a2"; //aaabcccaa 
		  String st=s.replaceAll("[1-9]", "");
	     /*           	String num = s.replaceAll("[^1-9]", "");
	      	  System.out.println(st);
		                         int n= Integer.parseInt(st);   */
		  
		  for(int i=0;i<s.length();i++) {
			                char ch= s.charAt(i+1);
			  for(int j=1;j<=(ch-48);j++) {
				  System.out.print(s.charAt(i));
			  }
			  i++;
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	/*	for(int i=0;i<s.length();i++) {
			 int n=Integer.valueOf(String.valueOf(s.charAt(i+1)));
			for(int j=1;j<=n;j++) {
				System.out.print(s.charAt(i));
			}
		}               */
	}

}

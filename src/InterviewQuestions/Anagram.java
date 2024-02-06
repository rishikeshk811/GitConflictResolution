package InterviewQuestions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		
		String s1 ="keep";
		String s2 ="peyyek";
		
		      char [] ch1=   s1.toCharArray();
		      
		      char [] ch2=   s2.toCharArray();
		      
		      
		      
		      
		      
		      
		      Arrays.sort(ch1);
		      Arrays.sort(ch2);
		       boolean rs= Arrays.equals(ch1, ch2);
		       if (rs==true) {
				System.out.println("both String is anagram ");
			}
		       else {
					System.out.println("both String is not anagram ");

			}

	}

}

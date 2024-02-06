package javaProgramme;

public class ReverseOnlyAlphabetInString {

	public static void main(String[] args) {

		String s ="rah3ul@sin#k";
		
		    String st=s.replaceAll("[^a-zA-Z]", "");
		    System.out.println(st);
		    
		    int maxInd =st.length()-1; 
		  
		    for(int i=0;i<s.length();i++) {
		    	if (s.charAt(i)>='a' && s.charAt(i)<='z') {
					System.out.print(st.charAt(maxInd));
					maxInd--;
				}
		    	else {
					System.out.print(s.charAt(i));
				}
		    }
	}

}

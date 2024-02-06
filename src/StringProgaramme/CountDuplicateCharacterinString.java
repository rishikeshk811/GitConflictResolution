package StringProgaramme;

public class CountDuplicateCharacterinString {

	public static void main(String[] args) {

		String s ="Testing Engineer";
		   String st=s.toLowerCase();
		   System.out.println("these are the duplicate character in the String ");
		  
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
			   if (count>1) {
				System.out.println(st.charAt(i)+"--->  "+count);
			}
		   }
	}

}

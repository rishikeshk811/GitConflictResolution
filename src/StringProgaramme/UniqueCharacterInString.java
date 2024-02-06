package StringProgaramme;

public class UniqueCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Testing Engineer";
		   String st=s.toLowerCase();
		   System.out.println("these are the Unique character in the String ");
		  
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
			   if (count==1) {
				System.out.println(st.charAt(i)+"--->  "+count);
			}
		   }
		  
	}

}

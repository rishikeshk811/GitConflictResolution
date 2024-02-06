package InterviewQuestions;

public class GetNumberFromString {

	public static void main(String[] args) {

		String s ="hksjf12kfjskj34fkj";
		   String [] st=s.split("[A-Za-z]");
		   String newSt ="";
		 //  System.out.println(st.length);
		   for(int i=0;i<st.length;i++) {
			   
			   if (!st[i].isEmpty()) {
				   System.out.print(st[i]+",");
			  
			}
			
			  
		   }
		   
		   
	}

}

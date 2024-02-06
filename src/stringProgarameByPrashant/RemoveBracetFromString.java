package stringProgarameByPrashant;

public class RemoveBracetFromString {

	public static void main(String[] args) {

		String s ="Hello[12]javaoooHelloabcHell";//only Hello will be removed from everywhere // [12]javaoooabcHell
		
	//	 String sn =s.replaceAll("\\[12]", "");
	String sn	 =s.replaceAll("Hello", "");
		 System.out.println(sn);
		 
	}

}

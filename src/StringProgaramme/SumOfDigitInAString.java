package StringProgaramme;

public class SumOfDigitInAString {

	public static void main(String[] args) {

		String st ="a2b4c6";
		int sum=0;
		
		for(int i=0;i<st.length();i++) {
			
			if (st.charAt(i)>='0' && st.charAt(i)<='9') {
				sum=sum+ (st.charAt(i)-48);
			}
		}
		
		
		
		
		System.out.println(sum);
	}

}

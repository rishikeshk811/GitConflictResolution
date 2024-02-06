package package1;

public class ReverseStringWithoutAnyLoop {

	public static void main(String[] args) {

		
		String s ="india";
		rev(s,s.length()-1);
	}
public static void rev(String s,int len) {
	if (len>=0) {
		System.out.print(s.charAt(len));
		
		// len--
	//	rev(s, len);
		
	// 	rev(s, len--);      run infinite time ,because it is post decrement Operator
		
		rev(s, --len); // pre-decrement Operator 
	}
}
}

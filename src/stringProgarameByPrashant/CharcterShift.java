package stringProgarameByPrashant;

import java.util.Scanner;

public class CharcterShift {

	public static void main(String[] args) {

		String s="RahulraNjAnSiNgH";
		String lowerChar="";
		String upperChar="";

		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)>='a' &&  s.charAt(i)<='z') {
				lowerChar=lowerChar+s.charAt(i);
			}
			else {
				upperChar=upperChar+ s.charAt(i);
			}
		}
		System.out.println(lowerChar+upperChar);
	}

}

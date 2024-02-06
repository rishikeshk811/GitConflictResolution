package interviewQuestionJAVA_PROGRAMME;

import java.util.HashSet;

public class MissingNumberInArray_27 {

	public static void main(String[] args) {
String s="";
		int a[]= {2,3,7,5};
		for(int i:a) {
			s=s+i;
		}
//		System.out.println(s);
		// find the missing number in the Array between 1 to 10 .
	//	HashSet<Integer> hs =new HashSet<Integer>();
	
		
		for(int i=1;i<=10;i++) {
			String st=""+i;
			if (s.contains(st)) {
				
			}
			else {
				System.out.println(i);
			}
			
			
		}
		
	
	}

}

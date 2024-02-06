package interviewQuestionJAVA_PROGRAMME;

import java.util.ArrayList;
import java.util.ListIterator;

public class PallindromeStringbyIterator {

	public static void main(String[] args) {
		
String s ="hiiih";
		
		ArrayList<Character>al =new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			al.add(s.charAt(i));
		}
		
		System.out.println(al);
		String newSt ="";
		         ListIterator<Character> it=al.listIterator();
		         while(it.hasNext()) {
		        	// System.out.println(it.next());
		         newSt=it.next()+newSt;
		         }
		         System.out.println(newSt);
		         if (s.equals(newSt)) {
					System.out.println("String "+s+" is pallindromic String ");
				}
		         else {
		        	 System.out.println("String "+s+" is not a pallindromic String ");
				}
	}

}

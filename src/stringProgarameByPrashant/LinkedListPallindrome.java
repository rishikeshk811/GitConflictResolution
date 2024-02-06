package stringProgarameByPrashant;

import java.util.LinkedList;

public class LinkedListPallindrome {

	public static void main(String[] args) {

		LinkedList<String> l =new LinkedList<String>();
		
		l.add("pot");
		l.add("dog");
		l.add("pot");
		
		
		LinkedList<String> newList = new LinkedList<String>();
		for(int i=l.size()-1;i>=0;i--) {
			newList.add(l.get(i));
		}
		if (l.equals(newList)) {
			System.out.println(" LinkedList "+l+" is Pallindrom List ");
		}
		else {
			System.out.println(" LinkedList "+l+" is not Pallindrom List ");

		}
	}

}

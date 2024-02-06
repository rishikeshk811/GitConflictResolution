package javaProgramme;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.plaf.SliderUI;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList<Object> al =new LinkedList<Object>();
		al.add("ram");
		al.add(674);
		al.add('A');
		al.add(783.4f);
		
		
		al.add(563.33);
		al.add(null);
		al.add(null);
		al.add("ram");
		al.add(674);
	
		System.out.println(al.size());
         al.removeFirst();
     al.removeLast();
     
     System.out.println(al.remove());
		System.out.println(al);
		System.out.println(al.size());
	}

}

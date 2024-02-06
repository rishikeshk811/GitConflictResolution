package javaProgramme;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {

		
		LinkedHashSet<Object> lhm =new LinkedHashSet<Object>();
		lhm.add("TCS");
		lhm.add("infosys");
		lhm.add(453);
		lhm.add("kabir");
		lhm.add(78.99);
		
		
		lhm.add("TCS");
		lhm.add(453);
		
		System.out.println(lhm.contains("TS"));
		System.out.println(lhm.size());
		System.out.println(lhm);
		
	
	}

}

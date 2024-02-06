package javaProgramme;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<Object>  hs  =new HashSet<Object>();
		hs.add(90);
		hs.add(34);
		hs.add(5699);
		hs.add(12);
		
		
		
		System.out.println(hs.isEmpty());
		System.out.println(hs);
	/*	hs.add(null);
		hs.add(null);
		hs.add(null);
		hs.add(89);   
		
		System.out.println(hs.size());
		System.out.println(hs);
	      Iterator<Object>  it=	hs.iterator();
	      while(it.hasNext()) {
	    	  System.out.println(it.next());
	      }                                                        */
		
		TreeSet<Object>  ts =new TreeSet<Object>(hs);
		
		ArrayList<Object> al  = new ArrayList<>(ts);
		System.out.println(ts);
		System.out.println(al);
	}

}

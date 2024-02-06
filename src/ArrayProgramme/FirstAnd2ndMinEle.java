package ArrayProgramme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class FirstAnd2ndMinEle {

	public static void main(String[] args) {
		LinkedList<Object> linked =new LinkedList<>();
		linked.add("rishikesh");
		linked.add(673);
		linked.add(5466.44);
		linked.add("fsdfksf");
		for(int i=0;i<linked.size();i++){
			System.out.println(linked.get(i));
		}
		
		
		
/*		int a[]= {4,5,6,2,3};
		
		int min=a[0];
for(int i=0;i<a.length;i++) {
	if (min>a[i]) {
		min=a[i];
	}
}
		//System.out.println("firstmin : "+);
		
		
		
		
		
		
	/*	
		TreeSet<Integer> ts =new TreeSet<Integer>();
		
	
		int a[]= {4,5,6,2,3};
		int b[]=new int[a.length-1];
		int min=a[0];
	//	int secondMin=a[1];
		for(int i=0;i<a.length;i++) {
			ts.add(a[i]);
		}
		System.out.println(ts);
	     ArrayList<Integer>al =new ArrayList<Integer>(ts);
	     System.out.println("firstmin : "+al.get(0));
	     System.out.println("Secondmin : "+al.get(1));
	     System.out.println("firstmax : "+al.get(al.size()-1));
	     System.out.println("secondmax : "+al.get(al.size()-2));    */
	}

}

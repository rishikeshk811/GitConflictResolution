package javaProgramme;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<EmployeeData> ts  =new HashSet<EmployeeData>();
		
		EmployeeData e1=new EmployeeData("rahul",34,"Deveops",88880.34);
		
		
		HashSet<String> ts1  =new HashSet<String>();
	
		EmployeeData e2=new EmployeeData("rahul",34,"Deveops",88880.34);
		EmployeeData e3=new EmployeeData("gunjan",24,"Testing",96780.34);
		EmployeeData e4=new EmployeeData("prashant",34,"Development",52280.34);
		EmployeeData e5=new EmployeeData("arpan",34,"HR",18880.34);
	  	ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
	
		ts1.add("harish");
		ts1.add("gunjan");
		ts1.add("prashant");
		ts1.add("ram");
		ts1.add("ram");
		ts1.add("rahul");
		ts1.add("ram");
		
		System.out.println(ts1);
	     Iterator<String>it=ts1.iterator();
	     
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     }   
	

	
   System.out.println(ts);
	
	}
	
	
}

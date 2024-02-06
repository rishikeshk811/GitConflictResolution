package javaProgramme;

import java.awt.Adjustable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.SliderUI;

public class ArrayListClass {

	public static void main(String[] args) {

		
		
		ArrayList<Object> al =new ArrayList<Object>();
		al.add("ram");
		al.add(674);
		al.add('A');
		al.add(783.4f);
		
		
		al.add(563.33);
		al.add(null);
		al.add(null);
		al.add("ram");
		al.add(674);
	System.out.println(al.contains("ram"));
	
		/*			System.out.println(al);
		System.out.println(al.size());
		// delete the Element at the index 4
for(int i=0;i<al.size();i++) {
		            if (i==4) {
				al.remove(i);
					}
			
			
					}
		System.out.println(al);
		System.out.println(al.size());   */
		System.out.println(al.remove("ram"));
	System.out.println(al.remove(4));
		System.out.println(al);
			}
		}
	



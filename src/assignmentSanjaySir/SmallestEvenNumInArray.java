package assignmentSanjaySir;

import java.util.ArrayList;

public class SmallestEvenNumInArray {

	public static void main(String[] args) {
		
		int x[]= {5,3,8,2,1,7,8,4};
	
		
	ArrayList<Integer> al =new ArrayList<Integer>();
		int y[]=new int[1];
		for(int i=0;i<x.length;i++) {
	
			
			
			
			if (x[i]%2==0) {
		
				al.add(x[i]);
		
		}
		
		}
	
		 int smallest=al.get(0);
		for(Integer n:al) {
			if (smallest>n) {
				smallest=n;
			}
		}
		System.out.println(smallest);
	}
}
		 

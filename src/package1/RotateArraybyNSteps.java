package package1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class RotateArraybyNSteps {

	public static void main(String[] args) {

		int [] nums = {1,2,3,4,5,6,7};//o/p -->[5,6,7,1,2,3,4]
		int steps=3;
		//int ind=steps-1;
		
	PriorityQueue<Integer> p =new PriorityQueue<Integer>();
	
	// maintion FIFO order
	

	
	
	
	
	//System.out.println(p.add(89));
	//System.out.println(p.offer(67));
	           //  p.add()
	//System.out.println(p.remove());
		
		
		
	//	ArrayList<Integer> ar =new ArrayList();
		
	
	      //    LinkedList<Integer> lr =new LinkedList<Integer>();
		Stack<Integer> st =new Stack<Integer>(); 
	
		for(int i=0;i<nums.length;i++) {
			st.add(nums[i]);
		}
	    
	    
		int n=0;
	//	st.peek();
	//	st.pop();
	//	System.out.println(st.toString());
		while(n<steps){
			
			 int a=	st.pop();
		     st.add(0, a);
			n++;
		}
		 System.out.println(st.toString());
		
/*		for(int i=0;i<nums.length;i++) {
			lr.add(nums[i]);
		}
		int i=0;
		while(i<steps) {
			
		}    */
	}

}

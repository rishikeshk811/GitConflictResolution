package package1;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		int b[]= {89,76,14,8,76,76};
		int remove=76;
		
		int count=0;
		for(int i=0;i<b.length;i++) {
			if (b[i]==remove) {
				b[i]=0;
				count++;
			}
		}
		int ind=0;
		int c[]=new int[b.length];
		for(int i=0;i<c.length;i++) {
			if (b[i]!=0) {
				c[ind]=b[i];
				ind++;
				
			}
		}
		
		System.out.println("the number of element which are not equal to "+remove+" is "+(c.length-count));
		System.out.println(Arrays.toString(c));
	}

}

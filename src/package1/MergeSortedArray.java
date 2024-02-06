package package1;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		int a[]= {12,65,31};
		int b[]= {89,76,14,8};
		int c[]=new int[a.length+b.length];
		
		
		for(int i=0;i<c.length;i++) {
			
			
			
			if (i<a.length) {
				c[i]=a[i];
			}
			else {
				c[i]=b[i-a.length];
			}
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}

}

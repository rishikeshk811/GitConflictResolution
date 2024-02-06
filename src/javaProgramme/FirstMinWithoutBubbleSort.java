package javaProgramme;

public class FirstMinWithoutBubbleSort {

	public static void main(String[] args) {

		
		
		int x[]= { 67,12,34,51,53,90};
		
		
		
		int min=x[0];
	
		
		
		
		
		for(int i=0;i<x.length;i++) {
			if (min>x[i]) {
			   min=x[i];
			}
		}
		System.out.println(min);
	}

}

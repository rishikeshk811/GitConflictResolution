package javaProgramme;

public class FirstMinimunUsingBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {10,31,45,21,87,19};
		int i;
			for( i=0;i<x.length;i++) {
				
				for(int j=i+1;j<x.length;j++) {
					
				
					
					if (x[i]>x[j]) {
						
						int temp=x[i];
						x[i]=x[j];
						x[j]=temp;
					}
				}
			 
			}
			
			System.out.println(x[0]);
			
	}

}

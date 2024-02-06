package javaProgramme;

public class SumOfthreeMinimunEle {

	public static void main(String[] args) {

		
		
		int y[]= {12,40,25,80,20,11};
		
		for(int i=0;i<y.length;i++) {
		
			
			
			
			
			
			
			for( int j=i+1;j<y.length;j++) {
				if (y[i]>y[j]) {
					int temp=y[i];
					 y[i]=y[j];
					y[j]=temp ;
	
				
				}
			}
		//	System.out.println(y[i]);
		}
		//sum of first 3 minimum numner using bubble sort 
		int sum=0;
		for( int i=0;i<3;i++) {
			
			sum=sum+y[i];
			}
		System.out.println(sum);
		}

}

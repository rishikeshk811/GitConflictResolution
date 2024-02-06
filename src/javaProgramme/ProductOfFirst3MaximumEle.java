package javaProgramme;

public class ProductOfFirst3MaximumEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int y[]= {12,10,4,8,20,7};
		
		for(int i=0;i<y.length;i++) {
		
			
			
			
			
			
			
			for( int j=i+1;j<y.length;j++) {
				if (y[i]<y[j]) {
					int temp=y[i];
					 y[i]=y[j];
					y[j]=temp ;
	
				
				}
			}
		//	System.out.println(y[i]);
		}
		//sum of first 3 minimum numner using bubble sort 
		int product=1;
		for( int i=0;i<3;i++) {
			
			product=product*y[i];
			}
		System.out.println(product);
	
	}

}

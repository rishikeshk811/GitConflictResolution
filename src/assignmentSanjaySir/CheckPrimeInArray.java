package assignmentSanjaySir;

public class CheckPrimeInArray {

	public static void main(String[] args) {
	
		int x[]= {7,4,2,5,1,9,8,3};
		
		for(int i=0;i<x.length;i++) {
			int count=0;
			for(int j=1;j<=x[i];j++) {
				if (x[i]%j==0) {
					count++;
				}
			}
			
			
			if (count==2) {
				System.out.println(x[i]);
			}
		}
	}

}

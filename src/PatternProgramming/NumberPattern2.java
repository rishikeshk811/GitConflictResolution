package PatternProgramming;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		          */
		
	
		
		int n=5;
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}

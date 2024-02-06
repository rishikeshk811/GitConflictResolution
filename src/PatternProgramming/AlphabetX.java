package PatternProgramming;

public class AlphabetX {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				
				
			if ( i==j || j==n-i  ) {
				System.out.print("* ");
			}	
			else {
				System.out.print("  ");
			}
				
		
			}
			System.out.println();
		}
	}

}

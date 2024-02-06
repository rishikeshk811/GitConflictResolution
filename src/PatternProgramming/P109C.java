package PatternProgramming;

public class P109C {

	public static void main(String[] args) {
		/*                 
		 *                 1
		 *              2    3
		 *            4         5
		 *          6              7
		
		 * 
		 */
		
		
		
		int n=4;
		int sp=n-1;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
			System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				
				if (j==1 || j==(2*i-1)) {
					
					
					System.out.print(num+" ");
					
					
					num++;
					
					
				}
				else {
					System.out.print("  ");
				}
			}
			sp--;
			System.out.println();
		}
	}

}

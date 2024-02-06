package PatternProgramming;

import java.util.Scanner;

public class P109b {

	public static void main(String[] args) {
/*                 A
 *              B     C
 *            D          E
 *          F              G
 *            H          I
 *               J     K
 *                  L  
 * 
 
 * 
 */
		System.out.println("enter your Number ");
		Scanner scanner =new Scanner(System.in);
		    int n =scanner.nextInt();
		int sp=n-1;
		int num=1;
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
			System.out.print("  ");
			}
			for(int j=1;j<=2*num-1;j++) {
				
				if (j==1 || j==(2*num-1)) {
					
					
					System.out.print(ch+" ");
					ch++;
					
				}
				else {
					System.out.print("  ");
				}
			}
			if (i<n/2+1) {
				sp--;
				num++;
			}
			else {
				sp++;
				num--;
			}
			System.out.println();
		}
		
		
		
	}
	}









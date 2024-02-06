package PatternProgramming;

import java.util.Scanner;

public class DiamondWithNumber {

	public static void main(String[] args) {
		System.out.println(" enter YOur Number ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(); 
		
		int sp=n/2;
		int num=1;
		for( int i=1;i<=n;i++) {
			
			for(int j=1;j<=sp;j++) {
				
					System.out.print("  ");
				
			
			}
			int x=1;
				for(int j=1;j<=2*num-1;j++) 
				 {
					
					
					System.out.print(x+" ");
						if (j<=(2*num-1)/2) {
							x++;
						}
						else {
							x--;
						}
						
	}
				if (i<=n/2) {
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

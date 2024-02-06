package PatternProgramming;

public class P088 {

	public static void main(String[] args) {
		int n=4;
		char ch='A';
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				if (i%2==1) {
					System.out.print(ch+" ");
				}
				else {
					System.out.print(num+" ");
				}
			}
			
			
			
			
			if (i%2==1) {
				ch++;
			}
			else {
				num++;
			}
			System.out.println();
		}
	}

}

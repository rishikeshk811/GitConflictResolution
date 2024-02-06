package PatternProgramming;

public class Po66 {
	public static void main(String[] args) {
		char ch='A';
  int num=1;
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if (j%2==1) {
					System.out.print(ch+" ");
					ch++;
				}
				else {
					System.out.print(num+" ");
					
					
					num++;
				}
			}
			System.out.println();
		}
	}

}

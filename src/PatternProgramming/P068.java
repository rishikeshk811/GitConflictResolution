package PatternProgramming;

public class P068 {

	public static void main(String[] args) {
     int num=1;
     char ch='A';
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if (j%2==1) {
					System.out.print(num+" ");
				}
				else {
					System.out.print(ch+" ");
				}
			}
			num++;
			ch++;
			System.out.println();
		}
	}

}

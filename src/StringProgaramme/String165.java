package StringProgaramme;

public class String165 {

	public static void main(String[] args) {

		String s ="JAVA";
		int n=s.length();
		while(n>=1) {
			for(int i=0;i<n;i++) {
				
				
				
				for(int j=0;j<=i;j++) {
					System.out.print(s.charAt(j)+" ");
					
				}
				System.out.println();
			}
			n--;
		}
		
	}

}

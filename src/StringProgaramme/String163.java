package StringProgaramme;

public class String163 {

	public static void main(String[] args) {
		String s ="FUN";
		int n=0;
		while(n<s.length()) {
			for(int i=0;i<s.length();i++) {
				
				
				
				for(int j=n;j<=i;j++) {
					System.out.print(s.charAt(j));
					
				}
				System.out.println();
			}
			
			n++;
		}
	}

}

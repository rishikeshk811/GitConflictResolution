package InterviewQuestions;

public class PatternProblemInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1 
		1 2 1 
		1 2 3 2 3 
		1 2 3 4 3 4 3 
		*/
		int n=4;
		for(int i=1;i<=n;i++) {
			
			int x=1;
	
			
			for(int j=1;j<=2*i-1;j++) {
			
				if (j<=(2*i-1)/2) {
					System.out.print(x+" ");
					x++;
				}
				else {
					System.out.print(x+" ");
					x--;
					
				}
				
				
				
			
			}
			System.out.println();
		}
	}

}

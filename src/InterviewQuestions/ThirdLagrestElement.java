package InterviewQuestions;import java.io.InterruptedIOException;

public class ThirdLagrestElement {

	public static void main(String[] args) {

		int a[]= {23,45,12,90,17,86};
		int firstmax=0;
		int secondmax=0;
		int thirdmax=0;

	
		
		
		
		
		
		for(int i=0;i<a.length;i++ ) {
			if (a[i]>firstmax) {
			
				thirdmax=secondmax;
				secondmax=firstmax;
				firstmax=a[i];
			}
			else if (a[i]>secondmax) {
				thirdmax=secondmax;
				secondmax=a[i];
			}
			else if (a[i]>thirdmax) {
				thirdmax=a[i];
			}
		}
		
		System.out.println(firstmax);
		System.out.println(secondmax);

		System.out.println(thirdmax);

	}

}

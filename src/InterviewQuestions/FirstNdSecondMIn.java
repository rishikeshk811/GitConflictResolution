package InterviewQuestions;

public class FirstNdSecondMIn {

	public static void main(String[] args) {

		int [] a= { 12,11,56,9,98};
		int first =a[0];
		int second=a[1];
		for(int i=0;i<a.length;i++) {
			
			if (a[i]<first) {
				second=first;
				
				
				
				
				
				first=a[i];
			}
			else if (a[i]<second) {
				second=a[i];
			}
			
	
			
		}
		System.out.println(first);
		System.out.println(second);

	}

}

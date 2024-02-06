package interviewQuestionJAVA_PROGRAMME;

public class FibonacciSeries_73 {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c=0;
		while(c<2000) {
	
			
			
			
			
	
			
			
			if (a%3==0 || a%5==0) {
				System.out.println(a);
			}
			
			
						
			
			
			c=a+b;
			a=b;
			b=c;
		}

	}

}

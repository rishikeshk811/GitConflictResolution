package assignmentSanjaySir;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		int c=0;
		int limit =10000;
		while(c<limit) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
		
		
	}

}

package assignmentSanjaySir;

public class TribonacciSeries {

	public static void main(String[] args) {


		int a=0;
		int b=0;
		int c=1;
		int next=0;
		int limit=10000;
		while(c<limit) {
			System.out.println(a);
			
			
			
			next=a+b+c;
			
			a=b;
			b=c;
			c=next ;
		}
	}

}

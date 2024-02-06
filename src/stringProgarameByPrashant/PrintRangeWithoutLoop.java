package stringProgarameByPrashant;

public class PrintRangeWithoutLoop {

	public static void main(String[] args) {

		
		int firstlimit =1;
		int lastLimit=10;
		// print 1 - 10 
		printRange(firstlimit,lastLimit);
	}
public static void printRange(int first,int last) {

	if (first<=last) {
	System.out.println(first);
	first++;
	printRange(first, last);
}
}
}

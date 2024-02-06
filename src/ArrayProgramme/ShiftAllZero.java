package ArrayProgramme;

public class ShiftAllZero {

	public static void main(String[] args) {

		int a[]= {5,0,4,0,0,9};
		int b[]=new int[a.length];
		int ind=0;
		for(int i=0;i<a.length;i++) {
			if (a[i]!=0) {
				b[ind]=a[i];
				ind++;
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}

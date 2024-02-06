package ArrayProgramme;

public class AddTwoArray {

	public static void main(String[] args) {

		
		int a[]= {2,4,5,6,9};
		int b[]= {4,8,1};
		int length=b.length;
		if (a.length>b.length) {
			length=a.length;
		}
		
		
		
		
		
		for(int i=0;i<length;i++) {
			try {
				System.out.println(a[i]+b[i]);
			} catch (Exception e) {
if (a.length<b.length) {
	System.out.println(b[i]);

}
else {
	System.out.println(a[i]);
}
			
			}
		}
	}

}

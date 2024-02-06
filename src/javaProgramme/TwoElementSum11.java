package javaProgramme;

public class TwoElementSum11 {

	public static void main(String[] args) {

		int x[]= {8,2,3,7,6,4,9,5};
		
		for(int i=0;i<x.length;i++) {
			for(int j=0+i;j<x.length;j++) {
				
				if (x[i]+x[j]==11) {
					System.out.println(x[i]+"--->"+x[j]+"   = 11");
				}
				}
			}
	}

}

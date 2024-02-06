package InterviewQuestions;

public class ThirdLagestElementInArray {

	public static void main(String[] args) {
		int a[]= {45,93,109,106,65,34};
/*		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
	//		System.out.println(a[i]);
		}
		
System.out.println(a[2]);              */
		int Ist=a[0];
		int Snd=a[0];
		int Trd=a[0];
		int sum =0;
		for(int i=0;i<a.length;i++) {
			if (a[i]>Ist) {
				Trd=Snd;
				Snd=Ist;
				Ist=a[i];
			}
			else if (a[i]>Snd) {
				Trd=Snd;
				Snd=a[i];
			}
			else if (a[i]>Trd) {
				Trd=a[i];
			}
		}
 		System.out.println(Ist);
		System.out.println(Snd);
		System.out.println(Trd);
	}
	
	
	
	
	
	
	
	
	

}

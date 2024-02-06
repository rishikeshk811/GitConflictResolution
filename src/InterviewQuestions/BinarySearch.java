package InterviewQuestions;

public class BinarySearch {

	public static void main(String[] args) {

		int a[]= {10,30,20,15,50,25};
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0+i;j<a.length;j++) {
				if (a[j]<a[i]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			b[i]=a[i];
				}
		
		boolean flag=false;
	
		
		int key=50;
		for(int i=0;i<b.length;i++) {
		//	key=i;
			
			
			int maxind=b.length-1;
			int mid=(i+maxind)/2;
		
				if (key>b[mid]) {
					i=mid;
				}
				else {
					mid=mid/2;
				}
			
			
			if (key==b[i]) {
				System.out.println(key+" is present ");
				flag=true;
			}
			 if (flag==false) {
				System.out.println(key+" is Absent ");
			}
		}
	
	}

}

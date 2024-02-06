package InterviewQuestions;

public class MaximumOccurence {

	public static void main(String[] args) {

		
		int x[]= {2,2,2,1,1,2,2,1,1,6,3,9,3,3,3,1,5,5,5,5,5,5};
		int max=0;
		int ele=0;
		for(int i=0;i<x.length;i++) {
			int count=0;
			for(int j=0;j<x.length;j++) {
				
				if (x[i]==x[j]) {
					
					if (i>j) {
						break;
					}
					else {
						count++;
					}
				}
				
			}
			if (count>=1) {
				
				if (count>max) {
					max=count;
					ele=x[i];
				}
				else if (count==max || count>max) {
				      System.out.println(x[i]+" -- > "+count);
				}
				
			}
		}
		System.out.println(ele+" -->  "+max);
	}

}

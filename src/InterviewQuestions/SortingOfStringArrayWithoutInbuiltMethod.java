package InterviewQuestions;

public class SortingOfStringArrayWithoutInbuiltMethod {

	public static void main(String[] args) {
		String sa[]= {"rahul","mukesh","kishan","raunak","Aziz"};
		
		for(int i=0;i<sa.length;i++) {
			
			String com=sa[i];
			for(int j=i+1;j<sa.length;j++) {
				
				
				
				
				
				String temp=sa[j];
				  boolean rs=  checkBigger(com,temp);
				  if(rs==true) {
					  String te =sa[i];
					  sa[i]=sa[j];
					  sa[j]=te;
				  }
				
			
			}
		}
	for(int i=0;i<sa.length;i++) {
		System.out.println(sa[i]);
	}
	}
public static boolean  checkBigger(String com,String temp) {
	
	boolean rs=false;
	int i=0;
	while(i<com.length()) {
		if(com.charAt(i)>temp.charAt(i)) {
			rs=true; 
			break;
		}
		else if (com.charAt(i)==temp.charAt(i)) {
			
		}
		else {
			break;
		}
		i++;
	}
	return rs;
	

	
}
}

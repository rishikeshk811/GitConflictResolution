package InterviewQuestions;

public class String2Reverse {

	public static void main(String[] args) {

		
		String s="My$ na%me is& %prak@sh";
		String [] st =s.split(" ");
		/*     String st=s.replaceAll(" ", "");
		     for( int i=st.length()-1;i>=0;i--) {
		    	 System.out.print(st.charAt(i));
		     }
		     System.out.println();
		     System.out.println(s);  
	   
/*		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)>='a' && s.charAt(i)<='z'  || s.charAt(i)>='A' && s.charAt(i)<='Z'  ) {
				st=st+s.charAt(i);
			}
		}
		System.out.println(s.length());
		System.out.println(st.length());              */
		
String snew="";
		
		for( int i=0;i<=st.length-1;i++) {
			   String temp=st[i];
			   int count=temp.length()-1;
			for(int j=temp.length()-1;j>=0;j--) {
				if (temp.charAt(j)>='a' && temp.charAt(j)<='z'  || temp.charAt(j)>='A' && temp.charAt(j)<='Z'  ) {
			       snew=snew+temp.charAt(j);
				}
				
			}
				snew=snew+" ";
			}
//		System.out.println(snew);
	System.out.println(s);    
	
	 
	
	
	int count=0;
for(int i=0;i<=s.length()-1;i++) {
	
	if (s.charAt(i)>='a' && s.charAt(i)<='z'  || s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)==' ') {
		System.out.print(snew.charAt(count++));
	}
	else {
		System.out.print(s.charAt(i));
	}
}
	

		}


}











package javaProgramme;

public class LagestSubStringWithUniqueCharacter {

	public static void main(String[] args) {

		String s ="ABDEFGABEF ";   // Encyclopedia
		
	                 char ch[] =	s.toCharArray();
	                 
	                 //Rishkeumar
	                 
	                 //ncy
	                 
	               
	                 String snew="";
	                 for(int i=0;i<ch.length;i++) {
	                	 String temp=String.valueOf(ch[i]);
	                
	                		 for(int j=i+1;j<ch.length;j++) {
		                		
		                		 if (!temp.contains(String.valueOf(ch[j]))) {
		                			
		                				 temp=temp+String.valueOf(ch[j]);
									
									
								}
		                		 else {
									j=ch.length;
								}
		                	 
	                	}
	                	
	                		 if (temp.length()>snew.length()) {
	                			 snew=temp;
	                			
							 }
	                	 
	                 }
	                 System.out.println(snew);
	}

}










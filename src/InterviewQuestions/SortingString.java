package InterviewQuestions;

import java.awt.Checkbox;

public class SortingString {

	public static void main(String[] args) {

		
		String s="rahulSingh";
		
		
		
		
		
		
		
		
		StringBuffer stringBuffer=new StringBuffer("askfsdf");
		System.out.println(stringBuffer);
		
		    char ch[]=s.toCharArray();
		    
		    for(int i=0;i<ch.length;i++) {
		    	
		    	
		    	
		    	
		    	for(int j=i+1;j<ch.length;j++) {
		    		
		    		if(ch[i]>ch[j]) {
		    			char temp=ch[i];
		    			ch[i]=ch[j];
		    			ch[j]=temp;
		    		}
		    	}
		    }
		    s=new String(ch);
		    System.out.println(s);
	}

}

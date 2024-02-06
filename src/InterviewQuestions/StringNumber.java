package InterviewQuestions;

public class StringNumber {

	public static void main(String[] args) {

		String  s ="sd23fjdskf12hsjf";
		String s1="";//23//""
		String res="";//,2//,3,1,2
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				s1=s1+s.charAt(i);
		}
			
			
			
			
			else if (!s1.isEmpty()) {
				
				
				res=res+","+s1;
				s1="";		
		
			}
		
		}
		
		res.replaceFirst(res, "");
		System.out.println(s1+res);
	}

	}



package interviewQuestionJAVA_PROGRAMME;

public class AsciiValue_52 {

	public static void main(String[] args) {
		
		String s="AfggggggaDFrkGd";
		char max=s.charAt(0);
		for(int i=0;i<s.length();i++) {
			int count=0;
			
			for(int j=0;j<s.length();j++) {
				if (s.charAt(i)==s.charAt(j)) {
					if (i>j) {
						break;
					}
					else {
						
						count++;
						
					}
				}
			}
			if (count>0) {
				System.out.println(s.charAt(i)+"---> "+count);
			}
			if (s.charAt(i)>max) {
				max=s.charAt(i);
			}
		}
System.out.println(max);
	}

}

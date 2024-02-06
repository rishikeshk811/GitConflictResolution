package stringProgarameByPrashant;

public class Anagram166 {

	public static void main(String[] args) {

		
		String s1 ="NOTEm";//KEEP-PEEK,RACE-CARE,LIPS-SLIP,NOTE-TONE,STATE-TASTE,NIGHT-THING
		String s2="TONEn";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		boolean rs[]=new boolean[s1.length()];
		
		boolean flag=false;
		if (s1.length()==s2.length()) {
			
			for(int i=0;i<s1.length();i++) {
				
				int count=0;
				
			
				for(int j=0;j<s2.length();j++) {
					if (ch1[i]==ch2[j]) {
						count++;
						ch2[j]=' ';
						break;
					}
				}
			System.out.println(count);
		if (count==1) {
			flag=true;
		}
		else {
			flag=false;
			break;
		}
				
			}

		}
		else {
			System.out.println("both the String "+s1+" and "+s2+" are not Anagram to Each Other ");
		}
		
		if (flag==true) {
			System.out.println("both the String "+s1+" and "+s2+" are  Anagram to Each Other ");
		}
		else {
			System.out.println("both the String "+s1+" and "+s2+" are not Anagram to Each Other ");

		}
		
		
		
		
		
		
		
		
		
		
	}

}

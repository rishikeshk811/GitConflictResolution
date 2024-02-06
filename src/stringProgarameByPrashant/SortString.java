package stringProgarameByPrashant;

public class SortString {

	public static void main(String[] args) {

		String n="rishikeShKumarSingh";
		char ch[]=n.toCharArray();
		// sorting String in Ascending order
		for(int i=0;i<ch.length;i++) {
			
		
			for(int j=i+1;j<ch.length;j++) {
				if (ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		n=new String(ch);
		System.out.println(n);
	}

}

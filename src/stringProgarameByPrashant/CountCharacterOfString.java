package stringProgarameByPrashant;

public class CountCharacterOfString {

	public static void main(String[] args) {

		String s ="Automation";
	      String [] st=	s.split("");
	      System.out.println(st.length);//10
	        char ch[]=   s.toCharArray();
	        int count=0;
	        for(char c:ch) {
	        	count++;
	        }
	        System.out.println(count);//10
	        
	        
	        int c=0;
	        for(String sn:st) {
	        	c++;
	        }
	        System.out.println(c);//10
	}

}

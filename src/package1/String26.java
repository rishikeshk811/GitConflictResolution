package package1;

public class String26 {

	public static void main(String[] args) {
		  String s="!hello!-a!";
	        // o/p--> !85121215!-1! 
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
	             //   char ch= (char)(s.charAt(i)-32);
	                int num=s.charAt(i)-96;
	           System.out.print(num);

	            }
	            else{
	                System.out.print(s.charAt(i));
	            }
	        }
	}

}

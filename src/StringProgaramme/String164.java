package StringProgaramme;

public class String164 {

	public static void main(String[] args) {
String s="BANGALORE";
     int ind=0;
     char ch=s.charAt(ind);
    for(int i=0;i<s.length();i++)
    {		
    	try {
    		for(int j=0;j<=i;j++) {
        		System.out.print(ch+" ");
        		ind++;
        		ch=s.charAt(ind);
        	}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.print("* ");
			break;
		}
    	System.out.println();
    }
		
	}

}

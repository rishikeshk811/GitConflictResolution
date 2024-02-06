package StringProgaramme;

public class ReverseStringinFormat {

	public static void main(String[] args) {

		String st ="i am  software Engineer";
	        String[]s=	st.split(" ");
	        
	        for( int i=s.length-1;i>=0;i--) {
	        	System.out.print(s[i]+" ");
	        }
	}

}

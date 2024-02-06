package StringProgaramme;

public class UseOfSplitMethod {

	public static void main(String[] args) {

		
		String s="ri12shik349e3s6h7";
	      String []st=s.split("[0-9]");
	      System.out.println(st.length);
	      for(int i=0;i<=st.length-1;i++) {
	    	  System.out.println(st[i]);
	      }
	}

}

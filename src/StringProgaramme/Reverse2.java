package StringProgaramme;

public class Reverse2 {

	public static void main(String[] args) {

		
		String s ="Aabb1235dd45ee1ff44";
		
		// o/p -- 44  1  45  1235 
	   String st[]=	s.split("[A-Za-z]");
	   for(int i=st.length-1;i>=0;i--) {
		   System.out.print(st[i]+" ");
	   }
	}

}

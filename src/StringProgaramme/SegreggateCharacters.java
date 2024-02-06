package StringProgaramme;

public class SegreggateCharacters {

	public static void main(String[] args) {

		String st="a1C$d3R%^";
		
		String alpha="";
		String num="";
		String spclchar="";
		for( int i=0;i<st.length();i++) {
			if (st.charAt(i)>='a' && st.charAt(i)<='z'  || st.charAt(i)>='A' && st.charAt(i)<='Z') {
				alpha=alpha+st.charAt(i);
			}
			
			
			else if (st.charAt(i)>='0'   && st.charAt(i)<='9') {
				num=num+st.charAt(i);
			}
			else {
				spclchar=spclchar+st.charAt(i);
			}
		}
		System.out.println(alpha+" "+num+" "+spclchar);
	} 
}

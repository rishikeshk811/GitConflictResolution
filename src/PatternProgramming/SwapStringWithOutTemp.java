package PatternProgramming;

public class SwapStringWithOutTemp {

	public static void main(String[] args) {

		String s1="java";
		String s2="Programming";
		System.out.println("before Swapping");
		System.out.println(s1);
		System.out.println(s2);
     /*  Using Temp Variable 
      *  String tempString=s2;
		 s2=new String(s1);
		 s1=new String(tempString);
			System.out.println("After Swapping");

		 System.out.println(s1);
			System.out.println(s2);     */
		// without Using Third temp Variable 
		char ch[] =s1.toCharArray();
		s1=s2;
		
		s2=new String(ch);
		System.out.println("After Swapping");

		 System.out.println(s1);
			System.out.println(s2);    
	}

}

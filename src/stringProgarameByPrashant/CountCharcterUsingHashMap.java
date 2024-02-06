package stringProgarameByPrashant;

import java.util.HashMap;

public class CountCharcterUsingHashMap {

	public static void main(String[] args) {
             Character k;
             int count=0;
		String  s ="Automation";
		HashMap<Object, Object>  hm =new HashMap<Object, Object>();
		for(int i=0;i<s.length();i++) {
			
			
			
            count++;

			
			
			             hm.put('k', count)  ;
			
			
			
		}
		System.out.println(s.length());
	System.out.println(hm.get('k'));
	}

}

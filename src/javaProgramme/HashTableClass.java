package javaProgramme;

import java.util.Hashtable;
import java.util.Map.Entry;


public class HashTableClass {

	public static void main(String[] args) {
	
		
		
		Hashtable<String, Integer> ht =new Hashtable<String, Integer>();
		ht.put("ram", 56);
		
		ht.put("muskan", 16);
		ht.put("ravi", 51);
		ht.put("suyash", 32);
		ht.put("prashant", 24);
		ht.put("ram", 16);
		
		
		// entrySet -->setofEntry   
		// keySet--->setofKeys
		
	/*	ht.put(null, 34);
		ht.put(null, null);
		ht.put("ram", null); 
		
		// it does't not allow any null key and null value 
		System.out.println(ht);
	}     */
		
		
		for(Entry<String, Integer> entry : ht.entrySet()) {
		//	System.out.println(entry);
			System.out.print(entry.getValue()+" ");
			System.out.print(entry.getKey()+" ");
		}
		
		
	for(Object  key  :ht.keySet()) {
		System.out.println(ht.get(key));
	}

}
}
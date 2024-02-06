package package1;

public  class Visa implements Country {
  String cnameString;
  String currencyString;
	@Override
	public void usa() {
		System.out.println("Washington DC");
		
	}

	@Override
	public void uk() {
System.out.println("london");		
	}

	@Override
	public void canada() {
System.out.println("Toronto");		
	}
	
		
	public void india(String greet) {
		System.err.println(greet);
System.out.println("newDelhi");	
System.out.println(cnameString);
	}
	
	public static void italy() {
System.out.println("Rome");		
	}
}

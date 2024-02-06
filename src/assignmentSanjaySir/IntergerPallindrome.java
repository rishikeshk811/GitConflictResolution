package assignmentSanjaySir;

import java.util.Scanner;

public class IntergerPallindrome {

	public static void main(String[] args) {

		System.out.println(" enter YOur Number ");
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt(); 
		
		int revNum=0;
	
		
		
		
		int n=m;
		
		while(n>0) {
			int r=n%10;
			revNum=revNum*10+r;
		//	System.out.println(n);
			n=n/10;
			
		}
	//	System.out.println(n);
		if (m==revNum) {
			System.out.println(" The User Enter Numebr  is pallindromic Number ");
		}
		else {
			System.out.println(" The User Enter Numebr  is not  pallindromic Number ");
		}
	}

}

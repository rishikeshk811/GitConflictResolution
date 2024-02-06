package assignmentSanjaySir;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" enter YOur Number ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(); 

		
	int count=0;
		for(int i=1;i<=n;i++) {
			
			if (n%i==0) {
				count++;
			}
		
		}
//		System.out.println(count);
		if (count==2) {
			System.out.println("the user Enetered Number "+n+" is prime Number");
		}
		else {
			System.out.println("the user Enetered Number "+n+" is not a  prime Number");
		}
	}

}

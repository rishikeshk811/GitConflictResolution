package assignmentSanjaySir;

public class PatternProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int i=1;i<=n;i++){
		    for(int j=i;j<=n;j++){
		        System.out.print(" ");
		    }
		    if(i>=2){
		        for(int j=1;j<i;j++){
		           System.out.print(j);  
		        }
		    }
		    for(int j=i;j>=1;j--){
		          System.out.print(j);
		    }
		    System.out.println();
		    
		}

	}

}

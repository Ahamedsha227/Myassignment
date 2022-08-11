package day2;

public class primeNumber {

	public static void main(String[] args) {
		
		int num = 13;
		
		boolean flag = false;
		
		for (int i=2; i<=num/2; i++ ) {
		
		if(num%i==0) {
			
			flag= true;
			break;
			
	     }
		if (flag==false) {
			System.out.println(num+  "It is Prime Number");
		}

		else { System.out.println(num+  "Its not Prime Number");
	}
		}

}
}
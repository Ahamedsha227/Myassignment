package day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 34343, temp,rev,R;
		temp=num;

	for (rev=0; num!=0; num/=10) {	
	   
		R = num%10;
	   rev=(rev*10)+R;
	}
	if(rev==temp) {	

	System.out.println("Palindrome number");
	}
	else {
	
	System.out.println("Not a palindrome number");  
	}
 }
		
		

	

}

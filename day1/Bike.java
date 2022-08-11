package day1;

public class Bike {
	
	public void applyBreak() {
		
		System.out.println("Bike-Break Appllied");
	}
	
	public void soundHorn () {
		
		System.out.println("Bike-Horn");
	}
	
	
	
	

	public static void main(String[] args) {
		
		Car C =new Car();
		
		C.applyBreak();
		
		C.soundHorn();
		 
		Bike B=new Bike();
		
		B.applyBreak();
		
		B.soundHorn();

	}

}

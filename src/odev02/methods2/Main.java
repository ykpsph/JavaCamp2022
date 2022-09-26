package odev02.methods2;

public class Main {

	public static void main(String[] args) {
		System.out.println(add(2, 33));
		System.out.println("result: "+multiply(3,4,5));
	}
	
	public static int add(int num1, int num2) {
		return num1+ num2;
	}
	
	public static int multiply(int... numbers) {
		int result = 1;
		for(int num:numbers) {
			result *= num;
		}
		return result;
	}
	public static void delete() {
		
	}
	
	public static void update() {
		
	}

}

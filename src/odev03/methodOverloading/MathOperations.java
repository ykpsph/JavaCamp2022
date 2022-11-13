package odev03.methodOverloading;

public class MathOperations {
	
	public void Operation(char ch, int num1, int num2) {
		if(ch == 'a') {
			Addition(num1, num2);
		}
		else if (ch == 's') {
			if(num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			Subtraction(num1, num2);
		} 
		else if (ch == 'm') {
			Multiplication(num1, num2);
		} 
		else {
			System.out.println("invalid operation");
		}
	}
	
	public void Addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void Subtraction(int num1, int num2) {
		System.out.println(num1-num2);
	}
	
	public void Multiplication(int num1, int num2) {
		System.out.println(num1*num2);
	}
	
	public void Multiplication(int num1, int num2, int num3) {
		System.out.println(num1*num2*num3);
	} // this is method overloading
}

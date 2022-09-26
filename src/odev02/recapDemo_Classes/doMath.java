package odev02.recapDemo_Classes;

public class doMath {
	public int add(int num1, int num2) {
		return num1+ num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1-num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	public int divide(int num1, int num2) {
		int temp = num1;
		if(num1 < num2) {
			num1 = num2;
			num2 = temp;
		}
		return num1/num2;
	}
}

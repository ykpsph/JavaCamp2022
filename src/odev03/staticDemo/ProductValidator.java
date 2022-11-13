package odev03.staticDemo;

public class ProductValidator {
	static {
		System.out.println("static yapici block calisti");
	}
	public static boolean isValid(Product product) {
		if(product.getPrice() > 0 && !product.getName().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void something() {
		
	}
}

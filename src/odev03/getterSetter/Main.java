package odev03.getterSetter;

public class Main {
	public static void main (String[] args) {
		Product product = new Product(1, "laptop", "asus", 3000, 2, "red");
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}
}

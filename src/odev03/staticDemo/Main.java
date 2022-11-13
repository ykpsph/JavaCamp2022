package odev03.staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product(1001, "laptop", 1200.99);
		manager.add(product);
		
		CrudDatabaseHelper.Crud.Create();
	}
}

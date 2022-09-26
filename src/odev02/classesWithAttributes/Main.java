package odev02.classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1, "laptop", "newest product", 3000, 43, "siyah");
		
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Macbook");
//		product.setPrice(12000);
//		product.setStockAmount(43);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		

	}
}

package odev03.getterSetter;

public class ProductManager {
	public void Add(Product product) {
		System.out.println("urun eklendi " + product.getName() + "urun kodu: "+product.getKod());
	}
}

package ders02;

public class Main {

	public static void main(String[] args) {
		String mesaj = "vade orani";

		Product product1 = new Product();
		product1.setName("kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(322);
		product1.setImageUrl("kahve.jpeg");

		Product product2 = new Product();
		product2.setName("tost makinesi");
		product2.setDiscount(3);
		product2.setUnitPrice(2500);
		product2.setUnitsInStock(102);
		product2.setImageUrl("tost.jpeg");
		
		Product[] products = {product1, product2};
		
		for(Product product:products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("533333333");
		individualCustomer.setCustomerNumber("002");
		individualCustomer.setFirstName("yakup");
		individualCustomer.setLastName("sipahi");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhoneNumber("5333333333");
		corporateCustomer.setTaxNumber("1122334455");
		corporateCustomer.setCustomerNumber("542322");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
	}
}

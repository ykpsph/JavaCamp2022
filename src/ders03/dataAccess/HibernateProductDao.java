package ders03.dataAccess;

import ders03.entities.Product;

public class HibernateProductDao implements IProductDao {
	public void add(Product product) {
		System.out.println("Hibernate ile veritabanina eklendi.");
	}

}

package ders03.dataAccess;

import ders03.entities.Product;

public class JdbcProductDao implements IProductDao{
	public void add(Product product) {
		System.out.println("JDBC ile veritabanina eklendi.");
	}

}
//sadece ve sadece db erisim kodlari buraya yazilir... SQL
// dao : data access object
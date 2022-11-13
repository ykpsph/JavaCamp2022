package ders03.business;




import java.util.List;

import ders03.core.logging.ILogger;
import ders03.dataAccess.IProductDao;
import ders03.entities.Product;

public class ProductManager {
	private IProductDao productDao;
	private ILogger[] loggers; // Logger[] loggers;
	
	public ProductManager(IProductDao productDao, ILogger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	public void add(Product product) throws Exception {
		if(product.getUnitPrice() < 10) {
			throw new Exception("urun fiyati 10'dan kucuk olamaz.");
		}
		
		productDao.add(product);
		
		for (ILogger iLogger : loggers) {
			iLogger.log(product.getName());
		}
	}
}
// is kurallari
/* something something something */
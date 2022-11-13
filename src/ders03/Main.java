package ders03;

import ders03.business.ProductManager;
import ders03.core.logging.DatabaseLogger;
import ders03.core.logging.FileLogger;
import ders03.core.logging.ILogger;
import ders03.dataAccess.HibernateProductDao;
import ders03.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone XS", 1100);
		
		ILogger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
		
		int[] nums1 = new int[] {1, 2, 3}; // {10, 2, 3}
		int[] nums2 = new int[] {4, 5, 6}; // {1, 2, 3}
		nums2 = nums1;
		nums1[0] = 10;
		System.out.println(nums1[0]);
	}
}
//oop with n layered app

// data access
// business
// UI 
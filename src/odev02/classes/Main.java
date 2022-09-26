package odev02.classes;

public class Main {

	public static void main(String[] args) {
//		reference type
        ManageCustomers customer = new ManageCustomers();
        customer.Add();
        customer.Remove();
        customer.Update();
        
        
//		ManageCustomers.Create();
		System.out.println("----------------");
		
		int[] group1 = {1,2,3};
		int[] group2 = {5,6,7};
		
		group2 = group1;
		group1[0] = 10;
		
		System.out.println(group2[0]);

	}

}

package odev03.interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository {
	public void add() {
		System.out.println("eklendi: MySql");
	}
}

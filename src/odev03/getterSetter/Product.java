package odev03.getterSetter;

public class Product {
	
	public Product(int id, String name, String desc, double price, int stockAmount, String renk) {
		System.out.println("yapici block calisti");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.desc = desc;
		this.stockAmount = stockAmount;
		
	}
	
	private int id;
	private String name;
	private String desc;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	public String getKod() {
		return this.name.substring(0,1) + id;
	}

}

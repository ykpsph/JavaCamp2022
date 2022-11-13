package odev03.polimorfizm;

public class CustomerManager {
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger logger) {
		this.baseLogger = logger;
	}
	
	public void add() {
		System.out.println("musteri eklendi");
		this.baseLogger.log("log mesaji");
	}
}

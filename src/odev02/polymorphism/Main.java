package odev02.polymorphism;

public class Main {

	public static void main(String[] args) {
//		EmailLogger logger = new EmailLogger();
//		logger.Log("Log mesaji");
		
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLog()};
//		for(BaseLogger logger:loggers){
//			logger.Log("Log mesaji");
//		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}

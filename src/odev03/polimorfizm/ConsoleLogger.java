package odev03.polimorfizm;

public class ConsoleLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged to console: "+message);
	}

}

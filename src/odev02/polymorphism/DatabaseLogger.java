package odev02.polymorphism;

public class DatabaseLogger extends BaseLogger {
	public void log(String message) {
		System.out.println(message + ": Logged to database");
	}
}

package odev02.polymorphism;

public class ConsoleLog extends BaseLogger {
	public void log(String message) {
		System.out.println(message+": Logged to Console");
	}
}

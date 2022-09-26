package odev02.polymorphism;

public class FileLogger extends BaseLogger{
	public void log(String message) {
		System.out.println(message+ ": Logged to file");
	}
}

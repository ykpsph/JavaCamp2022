package ders03.core.logging;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanina loglandi: " + data);
		
	}

}

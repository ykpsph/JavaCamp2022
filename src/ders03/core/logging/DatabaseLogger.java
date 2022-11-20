package ders03.core.logging;

import gun03.odev03.core.logger.Logger;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanina loglandi: " + data);
		
	}

}

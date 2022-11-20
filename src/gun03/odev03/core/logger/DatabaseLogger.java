package gun03.odev03.core.logger;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veritabanina loglandi: "+data);
    }
}

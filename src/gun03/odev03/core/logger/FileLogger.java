package gun03.odev03.core.logger;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandi: "+ data);
    }
}
